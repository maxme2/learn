package com.mz.catchCriminals.test;

import com.mz.catchCriminals.cop.Cop1;
import com.mz.catchCriminals.cop.Cop2;
import com.mz.catchCriminals.cop.Cop3;
import com.mz.catchCriminals.observer.Observer;
import com.mz.catchCriminals.offender.Offender1;
import com.mz.catchCriminals.offender.Offender2;
import com.mz.catchCriminals.subject.Subject;

/**
 * 功能简述：<br>
 * 〈测试类用于测试观察者模式〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 22:39
 * @since 1.0.0
 */
public class Clienter {
    public static void main(String[] args) {
        //定义两个嫌犯
        Subject xf1 = new Offender1();
        Subject xf2 = new Offender2();
        //定义三个观察便衣警察
        Observer cop1 = new Cop1();
        Observer cop2 = new Cop2();
        Observer cop3 = new Cop3();
        //为嫌犯增加观察便衣
        xf1.addObserver(cop1);
        xf1.addObserver(cop2);
        xf2.addObserver(cop1);
        xf2.addObserver(cop3);
        //定义嫌犯1的情况
        String message1 = "又卖了一批货";
        String message2 = "老大要下来视察了";
        xf1.notice(message1);
        xf2.notice(message2);
    }
}
