package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by pp on 2017/4/15.
 */
public class LogHandler implements InvocationHandler {

    public LogHandler(Object tager) {
        this.tager = tager;
    }

    private Object tager;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        System.out.println("日志记录开始......");
        method.invoke(tager);
        System.out.println("日志记录结束......");
        return null;
    }
}
