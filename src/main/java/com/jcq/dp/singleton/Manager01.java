package com.jcq.dp.singleton;

/**
 * 饿汉式实现
 * 线程安全，使用简单
 * 不过：类加载的时候就会被示例化
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Manager01 {

    // 示例化对象
    private static final Manager01 INSTANCE = new Manager01();

    /**
     * 私有化构造器
     */
    private Manager01() {
    }

    /**
     * 提供获取示例对象的方法
     *
     * @return Manager01
     */
    public static Manager01 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {

        Manager01 instance1 = Manager01.getInstance();
        Manager01 instance2 = Manager01.getInstance();
        Manager01 instance3 = Manager01.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}
