package com.jcq.dp.adapter;

/**
 * 适配器
 */
public class Adapter {

    private final Net net;

    public Adapter(Net net) {
        this.net = net;
    }

    public void net() {
        net.net();
    }
}
