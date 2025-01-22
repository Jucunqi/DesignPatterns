package com.jcq.dp.strategy;

/**
 * 自定义比较接口
 *
 * @author : jucunqi
 * @since : 2025/1/22
 */
public interface Comparator<T>{

    /**
     * 自定义比较逻辑
     * @param o1 第一个元素
     * @param o2 第二个元素
     * @return 如果第一个大于第二个返回正数，小于返回负数，否则返回0
     */
    int compareTo(T o1, T o2);
}
