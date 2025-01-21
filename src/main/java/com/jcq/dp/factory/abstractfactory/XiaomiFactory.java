package com.jcq.dp.factory.abstractfactory;

/**
 * 小米工厂
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class XiaomiFactory implements AbstractFactory{

    @Override
    public PhoneProduct createPhone() {
        return new XiaomiPhone();
    }

    @Override
    public RouterProduct createRouter() {
        return new XiaomiRouter();
    }
}
