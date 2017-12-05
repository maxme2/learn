package com.mz.definition;

/**
 * 功能简述：<br>
 * (通知接口)
 * 〈抽象观察者（通知)代码
 * 为所有具体的观察者定义一个接口，在得到主题的通知时调用update更新自己〉
 *
 * @author Dumas_mz
 * @create 2017/12/5 21:19
 * @since 1.0.0
 */
public interface Observer {
    void update(Subject subject);
}
