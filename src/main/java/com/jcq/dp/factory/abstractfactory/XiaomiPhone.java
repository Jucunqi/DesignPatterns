package com.jcq.dp.factory.abstractfactory;

/**
 * 小米手机
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class XiaomiPhone implements PhoneProduct{

    @Override
    public void start() {
        System.out.println("小米手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("小米手机关机");
    }
}
