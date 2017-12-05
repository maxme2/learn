package com.mz.definition;

/**
 * 功能简述：<br>
 * 〈测试类〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 21:23
 * @since 1.0.0
 */
public class TestObserver {
    public static void main(String[] args) {
        Subject subject = new CountSubject();

        Observer observer = new CountObserver();
        Observer observer1 = new CountObserver1();

        subject.registerObserver(observer);
        subject.registerObserver(observer1);
//        subject.removerObserver(observer1);
        subject.notifyObserver();
    }
}
