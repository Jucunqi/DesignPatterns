package com.jcq.dp.singleton;

import java.io.IOException;

/**
 * 懒汉式，同步方法
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Manager04 {

    private static Manager04 INSTANCE;
    /**
     * 私有化构造器
     */
    private Manager04() {
    }

    /**
     * 直接同步
     * @return Manager04
     */
    public static synchronized Manager04 getInstance() {

        if (INSTANCE == null) {
            INSTANCE = new Manager04();
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 100; j++) {
                new Thread(() -> {
                    Manager04 instance = getInstance();
                    System.out.println("当前线程：" + Thread.currentThread() + "实例: " + instance);
                }).start();
            }

        }
        System.in.read();
    }
}
