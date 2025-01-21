package com.jcq.dp.builder.builder01;

/**
 * 测试类
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Test {

    public static void main(String[] args) {
        Director director = new Director();
        Product product = director.getPruduct(new Worker());
        System.out.println(product);

    }
}
