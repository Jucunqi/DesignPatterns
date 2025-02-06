package com.jcq.dp.iterator;

/**
 * 数组 
 * 
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class MyArrayList<E> implements MyCollection<E>{


    int capacity = 2;
    private E[] array = (E[]) new Object[capacity];
    private int size;
    
    
    @Override
    public void add(E e) {

        if (size == array.length) {
            // 扩容
            capacity = capacity * 2;
            E[] arrayNew = (E[]) new Object[capacity];
            // 复制
            for (int i = 0; i < array.length; i++) {
                arrayNew[i] = array[i];
            }
            array = arrayNew;
        }

        array[size++] = e;
    }

    @Override
    public int size() {
        return size;
    }

    @Override
    public E get(int index) {

        return (E) array[index];
    }

    @Override
    public MyIterator iterator() {
        return new MyListIterator();
    }

    private class MyListIterator implements MyIterator{

        // 游标
        int cursor ;
        @Override
        public boolean hasNext() {

            if (cursor == size ) {
                return false;
            }
            return true;
        }

        @Override
        public Object next() {

            return array[cursor++];
        }
    }
}
