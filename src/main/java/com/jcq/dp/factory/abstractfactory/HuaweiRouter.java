package com.jcq.dp.factory.abstractfactory;

/**
 * 华为路由器
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class HuaweiRouter implements RouterProduct{

    @Override
    public void start() {
        System.out.println("华为路由器开机");
    }

    @Override
    public void shutdown() {
        System.out.println("华为路由器关机");
    }
}
