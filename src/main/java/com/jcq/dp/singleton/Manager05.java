package com.jcq.dp.singleton;

import java.io.IOException;

/**
 * 懒汉式 ：double check
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Manager05 {

    private static Manager05 INSTANCE;
    /**
     * 私有化构造器
     */
    private Manager05() {
    }

    /**
     * 双重检查
     * @return Manager04
     */
    public static Manager05 getInstance() {

        if (INSTANCE == null) {
            synchronized (Manager05.class) {
                if (INSTANCE == null) {
                    INSTANCE = new Manager05();
                }
            }
        }
        return INSTANCE;
    }

    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 100; j++) {
                new Thread(() -> {
                    Manager05 instance = getInstance();
                    System.out.println("当前线程：" + Thread.currentThread() + "实例: " + instance);
                }).start();
            }

        }
        System.in.read();
    }
}
