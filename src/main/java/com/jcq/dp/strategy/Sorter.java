package com.jcq.dp.strategy;


public class Sorter {

    /**
     * 写死的int类型排序
     *
     * @author : jucunqi
     * @since : 2025/1/22
     */
    public static void sort(int[] arr) {

        for (int i = 0; i < arr.length-1; i++) {

            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {
                minPos = arr[j]<arr[minPos]? j:minPos;
            }
            swap(arr, i, minPos);
        }
    }

    static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 通过实现comparator接口，不过类型还是写死的
     *
     * @author : jucunqi
     * @since : 2025/1/22
     */
    public static void comparatorSort(Cat[] cats,Comparator<Cat> c) {

        for (int i = 0; i < cats.length-1; i++) {

            int minPos = i;
            for (int j = i+1; j < cats.length; j++) {
                // minPos = cats[j].getAge()<cats[minPos].getAge()? j:minPos;

                // minPos = cats[j].compareTo(cats[j], cats[minPos]) < 0 ? j : minPos;

                minPos = c.compareTo(cats[j], cats[minPos])< 0 ? j : minPos;

            }
            swap(cats, i, minPos);
        }
    }

    static void swap(Cat[] arr, int i, int j) {
        Cat temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

    /**
     * 通过策略模式排序
     *
     * @author : jucunqi
     * @since : 2025/1/22
     */
    public static <T> void strategySort(T[] arr,Comparator<T> c){

        for (int i = 0; i < arr.length-1; i++) {

            int minPos = i;
            for (int j = i+1; j < arr.length; j++) {

                minPos = c.compareTo(arr[j], arr[minPos])< 0 ? j : minPos;

            }
            swap(arr, i, minPos);
        }
    }

    static <T> void swap(T[] arr, int i, int j) {
        T temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }
}
