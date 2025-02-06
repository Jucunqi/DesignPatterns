package com.jcq.dp.proxy.v1;

/**
 * 静态代理 - 基础的代理
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class Main {

    public static void main(String[] args) {
        Tank tank = new Tank();
        TankProxy tankProxy = new TankProxy(tank);
        tankProxy.move();
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

class TankProxy implements Moveable {

    Tank tank;

    public TankProxy(Tank tank) {
        this.tank = tank;
    }

    @Override
    public void move() {
        System.out.println("proxy start");
        tank.move();
        System.out.println("proxy end");

    }
}