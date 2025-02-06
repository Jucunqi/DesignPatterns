package com.jcq.dp.proxy.v4;

import net.sf.cglib.proxy.Enhancer;
import net.sf.cglib.proxy.MethodInterceptor;
import net.sf.cglib.proxy.MethodProxy;

import java.lang.reflect.Method;

/**
 * cglib 实现动态代理  - spring aop就是使用的这种方式
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class Main {

    public static void main(String[] args) {
        Enhancer enhancer = new Enhancer();

        Tank tank = new Tank();
        Tank instance = (Tank) enhancer.create(tank.getClass(), new MethodInterceptor() {
            @Override
            public Object intercept(Object o, Method method, Object[] objects, MethodProxy methodProxy) throws Throwable {

                System.out.println("proxy start");
                method.invoke(tank, objects);
                System.out.println("proxy end");
                return null;
            }
        });

        instance.move();

    }
}


class Tank{

    void move() {
        System.out.println("tank move wuwuwuwuwuw");
    }
}
