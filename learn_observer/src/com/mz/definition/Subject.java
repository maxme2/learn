package com.mz.definition;

/**
 * 功能简述：<br>
 * 〈抽象主题(被观察者)代码〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 21:08
 * @since 1.0.0
 */
public interface Subject {
    void registerObserver(Observer observer);

    void removerObserver(Observer observer);

    void notifyObserver();
}
