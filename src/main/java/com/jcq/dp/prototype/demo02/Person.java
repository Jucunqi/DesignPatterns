package com.jcq.dp.prototype.demo02;

import java.util.Date;
import java.util.List;

/**
 * 原型模式，深克隆
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Person implements Cloneable{

    private String name;

    private Date date;

    public Person(String name, Date haha) {
        this.name = name;
        this.date = haha;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        Person p2 = (Person) super.clone();
        Date date2 = (Date) date.clone();
        p2.setDate(date2);
        return p2;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", date=" + date +
                '}';
    }
}
