package com.jcq.dp.singleton;

/**
 * 静态内部类的方式实现
 * 也是懒加载
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Manager06 {

    /**
     * 私有化构造
     */
    private Manager06() {
    }

    /**
     * 静态内部类
     *
     * @author : jucunqi
     * @since : 2025/1/21
     */
    private static class Manager06Holder{
        private static final Manager06 INSTANCE = new Manager06();
    }

    public static Manager06 getInstance() {
        return Manager06Holder.INSTANCE;
    }
}
