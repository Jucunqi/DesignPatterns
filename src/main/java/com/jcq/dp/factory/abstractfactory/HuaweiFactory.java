package com.jcq.dp.factory.abstractfactory;

/**
 * 华为工厂
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class HuaweiFactory implements AbstractFactory{

    @Override
    public PhoneProduct createPhone() {
        return new HuaweiPhone();
    }

    @Override
    public RouterProduct createRouter() {
        return new HuaweiRouter();
    }
}
