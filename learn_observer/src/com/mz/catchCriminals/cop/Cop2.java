package com.mz.catchCriminals.cop;

import com.mz.catchCriminals.observer.Observer;

/**
 * 功能简述：<br>
 * 〈二号警察: 观察者二〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 22:22
 * @since 1.0.0
 */
public class Cop2 implements Observer {

    //定义姓名
    private String name = "石破天";
    @Override
    public void update(String message, String name) {
        System.out.println(this.name+":" + name + "发现犯罪团伙有新情况：" + message);
    }
}
