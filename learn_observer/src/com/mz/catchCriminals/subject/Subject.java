package com.mz.catchCriminals.subject;

import com.mz.catchCriminals.observer.Observer;

/**
 * 功能简述：<br>
 * 〈被观察者: 坏人〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 22:27
 * @since 1.0.0
 */
public interface Subject {
    //添加观察者
    void addObserver(Observer observer);
    //移除观察者
    void removeObserver(Observer observer);
    //通知观察者
    void notice(String message);
}
