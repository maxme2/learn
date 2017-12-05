package com.mz.catchCriminals.cop;

import com.mz.catchCriminals.observer.Observer;

import java.lang.annotation.Annotation;

/**
 * 功能简述：<br>
 * 〈警察三: 观察者三〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 22:24
 * @since 1.0.0
 */
public class Cop3 implements Observer {

    //定义警察姓名
    private String name = "赵日天";
    @Override
    public void update(String message, String name) {
        System.out.println(this.name+":" + name + "发现犯罪团伙有新情况：" + message);
    }
}
