package com.jcq.dp.prototype.demo01;

import java.util.ArrayList;
import java.util.List;

public class Test {

    public static void main(String[] args) throws CloneNotSupportedException {

        List<String> list = new ArrayList<>();
        list.add("a");
        list.add("b");
        Person p1 = new Person("张三", list);
        Person p2 = (Person) p1.clone();
        list.add("c");
        p1.setHaha(list);
        System.out.println(p1);
        System.out.println(p2);

    }
}
