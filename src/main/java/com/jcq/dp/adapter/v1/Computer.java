package com.jcq.dp.adapter.v1;

/**
 * 电脑类 ，不能直接插网线，口不一样
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Computer {

    /**
     * 无法直接操作Net类进行上网
     * @param adapter 适配器
     */
    void computerNet(Adapter adapter) {
        adapter.net();
    }

    public static void main(String[] args) {
        // 创建使用对象
        Computer computer = new Computer();
        // 创建目标对象
        Net net = new Net();
        // 创建适配器对象
        Adapter adapter = new Adapter(net);
        computer.computerNet(adapter);
    }
}
