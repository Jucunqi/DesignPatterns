package com.jcq.dp.builder.builder03;

/**
 * 测试类
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Test {

    public static void main(String[] args) {

        Product product1 = new Product.ProductBuilder()
                .buildA("1")
                .buildB("2")
                .buildC("3")
                .buildD("4")
                .build();
        System.out.println(product1);

        Product product2 = new Product.ProductBuilder()
                .buildA("a")
                .buildB("b")
                .buildC("c")
                .buildD("d")
                .build();
        System.out.println(product2);
    }
}
