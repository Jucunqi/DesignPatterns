package com.jcq.dp.strategy;


import java.util.Collections;

public class Main {

    public static void main(String[] args) {
        // int[] arr = new int[]{5, 9, 2, 4, 10};
        // Sorter.sort(arr);
        // for (int i = 0; i < arr.length ; i++) {
        //     System.out.println(arr[i]);
        // }

        Cat c1 = new Cat(5);
        Cat c2 = new Cat(9);
        Cat c3 = new Cat(2);
        Cat c4 = new Cat(4);
        Cat c5 = new Cat(10);
        Cat[] cats = new Cat[]{c1, c2, c3, c4, c5};
        Sorter.strategySort(cats, (o1, o2) -> o1.getAge() - o2.getAge());
        for (Cat cat : cats) {
            System.out.println(cat);
        }



    }
}
