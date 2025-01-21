package com.jcq.dp.factory.method;


/**
 * 特斯拉工厂
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class TeslaCarFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new TeslaCar();
    }
}
