package com.jcq.dp.iterator;

public interface MyCollection<E> {

    /**
     * 添加元素
     * @param t 元素
     */
    void add(E t);

    /**
     * 获取数量
     * @return 总数量
     */
    int size();

    /**
     * 获取元素
     * @param index 索引下标
     * @return 元素
     */
    E get(int index);

    MyIterator iterator();
}
