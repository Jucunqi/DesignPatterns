package com.jcq.dp.singleton;

/**
 * 饿汉式实现
 * 与Manager01相同，只是写法不同
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Manager02 {

    // 示例化对象
    private static Manager02 INSTANCE ;

    static {
        INSTANCE = new Manager02();
    }

    /**
     * 私有化构造器
     */
    private Manager02() {
    }

    /**
     * 提供获取示例对象的方法
     *
     * @return Manager01
     */
    public static Manager02 getInstance() {
        return INSTANCE;
    }

    public static void main(String[] args) {

        Manager02 instance1 = Manager02.getInstance();
        Manager02 instance2 = Manager02.getInstance();
        Manager02 instance3 = Manager02.getInstance();

        System.out.println(instance1);
        System.out.println(instance2);
        System.out.println(instance3);
    }
}
