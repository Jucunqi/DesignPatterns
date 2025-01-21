package com.jcq.dp.builder.builder01;

/**
 * 指挥者，用于指定构建顺序
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Director {

    public Product getPruduct(ProductBuilder builder) {
        builder.buildA("aaa");
        builder.buildB("bbb");
        builder.buildC("ccc");
        builder.buildD("ddd");
        return builder.build();
    }
}
