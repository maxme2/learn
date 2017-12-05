package com.mz.catchCriminals.offender;

import com.mz.catchCriminals.observer.Observer;
import com.mz.catchCriminals.subject.Subject;

import java.util.ArrayList;
import java.util.List;

/**
 * 功能简述：<br>
 * 〈坏人二:  被观察者二 〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 22:37
 * @since 1.0.0
 */
public class Offender2 implements Subject{
    //别称
    private String name = "熊二";
    //定义观察者集合
    private List<Observer> observerList = new ArrayList<Observer>();
    //增加观察者
    @Override
    public void addObserver(Observer observer) {
        if(!observerList.contains(observer)){
            observerList.add(observer);
        }
    }
    //移除观察者
    @Override
    public void removeObserver(Observer observer) {
        if(observerList.contains(observer)){
            observerList.remove(observer);
        }
    }
    //通知观察者
    @Override
    public void notice(String message) {
        for(Observer observer:observerList){
            observer.update(message,name);
        }
    }
}
