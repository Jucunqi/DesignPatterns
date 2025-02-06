package com.jcq.dp.iterator;


/**
 * 迭代器模式，遍历数据
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class Main {

    public static void main(String[] args) {

        // MyArrayList<Integer> list = new MyArrayList<>();
        // list.add(10);
        // list.add(20);
        // list.add(30);
        // list.add(40);
        // list.add(50);

        // for (int i = 0; i < list.size(); i++) {
        //     System.out.println(list.get(i));
        // }
        //
        // MyIterator iterator = list.iterator();
        // while (iterator.hasNext()) {
        //     System.out.println(iterator.next());
        //
        // }

        MyLinkedList<Integer> linkedList = new MyLinkedList<>();
        linkedList.add(10);
        linkedList.add(20);
        linkedList.add(30);

        MyIterator iterator = linkedList.iterator();
        while (iterator.hasNext()) {
            System.out.println(iterator.next());
        }

    }
}
