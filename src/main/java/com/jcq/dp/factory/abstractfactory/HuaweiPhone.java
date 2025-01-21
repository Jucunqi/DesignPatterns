package com.jcq.dp.factory.abstractfactory;

/**
 * 华为手机
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class HuaweiPhone implements PhoneProduct{

    @Override
    public void start() {
        System.out.println("华为手机开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为手机关机");
    }
}

