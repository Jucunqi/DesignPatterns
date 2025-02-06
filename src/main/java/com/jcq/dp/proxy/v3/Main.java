package com.jcq.dp.proxy.v3;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 测试jdk动态代理 - jdk动态代理需要被代理对象实现接口
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class Main {

    public static void main(String[] args) {

        Moveable moveable = new Tank();
        Moveable instance = (Moveable) Proxy.newProxyInstance(moveable.getClass().getClassLoader(), moveable.getClass().getInterfaces(), new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {

                System.out.println(proxy.hashCode());
                System.out.println("proxy start");
                method.invoke(moveable, args);
                System.out.println("proxy end");
                return null;
            }
        });


        instance.move();
    }
}

interface Moveable{

    void move();
}

class Tank implements Moveable {
    @Override
    public void move() {
        System.out.println("tank move wuwuwu");
    }
}
