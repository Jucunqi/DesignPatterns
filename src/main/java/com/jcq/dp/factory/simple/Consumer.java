package com.jcq.dp.factory.simple;

/**
 * 消费者
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Consumer {

    public static void main(String[] args) {

        // 最原始的创建对象
        Car wuling = new WulingCar();
        Car tesla = new TeslaCar();
        wuling.name();
        tesla.name();
        // 通过工厂创建对象
        Car car1 = CarFactory.getCar("wuling");
        Car car2 = CarFactory.getCar("tesla");
        car1.name();
        car2.name();

        CarFactory.getWuling().name();
        CarFactory.getTesla().name();
    }
}
