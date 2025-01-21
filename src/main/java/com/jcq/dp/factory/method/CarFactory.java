package com.jcq.dp.factory.method;

/**
 * 工厂方法模式：定义车工厂接口
 * 每个车都需要实现一个工厂
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public interface CarFactory {

    /**
     * 获取Car
     * @return Car
     */
    Car getCar();
}
