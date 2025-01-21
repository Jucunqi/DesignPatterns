package com.jcq.dp.factory.method;


/**
 * 消费者
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Consumer {

    public static void main(String[] args) {

        // 通过工厂方法模式获取
        new WulingFactory().getCar().name();
        new TeslaCarFactory().getCar().name();
    }
}
