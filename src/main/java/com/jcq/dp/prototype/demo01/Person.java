package com.jcq.dp.prototype.demo01;

import java.util.List;

/**
 * 原型模式 需要实现cloneable接口
 * 浅克隆：引用相同的地址
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Person implements Cloneable {

    private String name;
    private List<String> haha;

    public Person(String name, List<String> haha) {
        this.name = name;
        this.haha = haha;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setHaha(List<String> haha) {
        this.haha = haha;
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return super.clone();
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", haha=" + haha +
                '}';
    }
}
