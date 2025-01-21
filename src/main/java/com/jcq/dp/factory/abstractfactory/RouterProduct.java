package com.jcq.dp.factory.abstractfactory;

/**
 * 路由器产品
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public interface RouterProduct {

    /**
     * 开机
     */
    void start();

    /**
     * 关机
     */
    void shutdown();
}
