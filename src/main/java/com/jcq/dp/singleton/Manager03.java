package com.jcq.dp.singleton;

import java.io.IOException;

/**
 * 基于懒汉式实现
 * 这种写法线程不安全
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Manager03 {

    private static Manager03 INSTANCE;
    /**
     * 私有化构造器
     */
    private Manager03() {
    }

    public static Manager03 getInstance() {

        if (INSTANCE == null) {
            try {
                Thread.sleep(1);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }
            INSTANCE = new Manager03();
        }
        return INSTANCE;
    }


    public static void main(String[] args) throws IOException {

        for (int i = 0; i < 100; i++) {

            for (int j = 0; j < 100; j++) {
                new Thread(() -> {
                    Manager03 instance = getInstance();
                    System.out.println("当前线程：" + Thread.currentThread() + "实例: " + instance);
                }).start();
            }

        }
        System.in.read();
    }
}
