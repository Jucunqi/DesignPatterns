package com.jcq.dp.factory.abstractfactory;

/**
 * 定义抽象工厂，抽象工厂关注产品族
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public interface AbstractFactory {

    /**
     * 生产手机
     * @return PhoneProduct
     */
    PhoneProduct createPhone();

    /**
     * 生产路由器
     * @return RouterProduct
     */
    RouterProduct createRouter();
}
