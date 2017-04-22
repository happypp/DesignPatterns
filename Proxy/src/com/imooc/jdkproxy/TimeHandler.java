package com.imooc.jdkproxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;

/**
 * Created by pp on 2017/4/15.
 */
public class TimeHandler implements InvocationHandler {

    public TimeHandler(Object tager) {
            this.tager = tager;
        }

    private Object tager;

    @Override
    public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
        long startTime = System.currentTimeMillis();
        System.out.println("汽车开始行驶......");
        method.invoke(tager);
        long endTime = System.currentTimeMillis();
        System.out.println("汽车结束行驶......  汽车行驶的时间：" + (endTime - startTime) + "毫秒");
        return null;
    }
}
