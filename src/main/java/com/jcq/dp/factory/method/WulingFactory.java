package com.jcq.dp.factory.method;


/**
 * 五菱宏光工厂
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class WulingFactory implements CarFactory{

    @Override
    public Car getCar() {
        return new WulingCar();
    }
}
