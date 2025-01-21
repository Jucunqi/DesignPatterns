package com.jcq.dp.factory.abstractfactory;

/**
 * 消费者
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Consumer {

    public static void main(String[] args) {
        // 小米工厂
        AbstractFactory xiaomiFactory = new XiaomiFactory();
        PhoneProduct xiaomiPhone = xiaomiFactory.createPhone();
        xiaomiPhone.start();
        xiaomiFactory.createRouter().start();
        xiaomiFactory.createRouter().shutdown();
        // 华为工厂
        AbstractFactory huaweiFactory = new HuaweiFactory();
        huaweiFactory.createPhone().start();
        huaweiFactory.createPhone().shutdown();
        huaweiFactory.createRouter().start();
        huaweiFactory.createRouter().shutdown();
    }
}
