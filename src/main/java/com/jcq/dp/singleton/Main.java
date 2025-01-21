package com.jcq.dp.singleton;

public class Main {

    public static void main(String[] args) {
        Manager07 instance1 = Manager07.INSTANCE;
        Manager07 instance2 = Manager07.INSTANCE;
        Manager07 instance3 = Manager07.INSTANCE;
        System.out.println(instance1.hashCode());
        System.out.println(instance2.hashCode());
        System.out.println(instance3.hashCode());
    }
}
