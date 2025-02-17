package com.jcq.dp.flyweight;

/**
 * 享元模式 - 共享元素 
 * String 就是享元模式
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class TestString {

    public static void main(String[] args) {

        String s1 = "abc";
        String s2 = "abc";
        String s3 = new String("abc");
        String s4 = new String("abc");

        System.out.println(s1 == s2);
        System.out.println(s3 == s4);
        System.out.println(s3.intern() == s4.intern());
    }
}
