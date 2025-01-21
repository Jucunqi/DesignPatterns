package com.jcq.dp.prototype.demo02;

import java.util.Date;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        Date date = new Date();
        Person p1 = new Person("张三", date);
        System.out.println(p1);
        Person p2 = (Person) p1.clone();
        date = new Date();
        p1.setDate(new Date(date.getTime()+10000000));
        System.out.println(p1);
        System.out.println(p2);
    }
}
