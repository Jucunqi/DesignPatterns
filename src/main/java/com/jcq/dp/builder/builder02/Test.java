package com.jcq.dp.builder.builder02;

/**
 * 测试类
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Test {

    public static void main(String[] args) {

        Product build = new Worker().buildA("aaa").buildB("bbb").buildC("ccc").buildD("ddd").build();
        Product build1 = new Worker().buildA("111").buildB("222").buildC("333").buildD("444").build();

        System.out.println(build);
        System.out.println(build1);
    }
}
