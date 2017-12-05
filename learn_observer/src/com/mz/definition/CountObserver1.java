package com.mz.definition;

/**
 * 功能简述：<br>
 * 〈观察者B   观察者对象实现观察者接口〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 21:21
 * @since 1.0.0
 */
public class CountObserver1 implements Observer {

    @Override
    public void update(Subject subject) {
        for (int i = 5; i > 0; i--){
            System.out.println("CountObserver1 is working. i = " + i);
        }
    }
}
