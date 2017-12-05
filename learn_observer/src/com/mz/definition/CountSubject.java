package com.mz.definition;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能简述：<br>
 * 〈具体主题类(被观察者)实现代码  主题类(被观察者)实现被观者接口  主题类(被观察者)注册自己需要通知的观察者
 *  维护了一个观察者的list并实现了对观察者的增加和删除。notifyObserver则通知所有的观察者
 *  主题类(被观察者)某个业务逻辑发生时， 通知观察者对象，每个观察者执行自己的业务逻辑。
 *  〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 21:21
 * @since 1.0.0
 */
public class CountSubject implements Subject {

    private List<Observer> observerList;

    public CountSubject() {
        observerList = new ArrayList<>();
    }

    public void registerObserver(Observer observer) {//提供注册观察者方法，维护了一个观察者的list并实现了对观察者的增加和删除
        observerList.add(observer);
    }

    public void removerObserver(Observer observer) {
        observerList.remove(observer);
    }

    public void notifyObserver() {
        observerList.stream().forEach(o -> o.update(this));
    }
}
