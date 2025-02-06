package com.jcq.dp.proxy.v2;

import java.util.Date;

/**
 * 静态代理 - 多个代理组合
 * 将代理对象替换为代理接口
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class Main {

    public static void main(String[] args) {
        Tank tank = new Tank();
        TankLogProxy tankLogProxy = new TankLogProxy(tank);
        TankTimeProxy tankTimeProxy = new TankTimeProxy(tankLogProxy);
        tankTimeProxy.move();
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

class TankTimeProxy implements Moveable {

    Moveable moveable;

    public TankTimeProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("proxy start time" + new Date());
        moveable.move();
        System.out.println("proxy end time" + new Date());
    }
}

class TankLogProxy implements Moveable {

    Moveable moveable;

    public TankLogProxy(Moveable moveable) {
        this.moveable = moveable;
    }

    @Override
    public void move() {
        System.out.println("proxy start log");
        moveable.move();
        System.out.println("proxy end log");
    }
}
