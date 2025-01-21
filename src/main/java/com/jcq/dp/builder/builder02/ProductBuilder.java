package com.jcq.dp.builder.builder02;

/**
 * 复杂产品的抽象构建者
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public abstract class ProductBuilder {

    abstract ProductBuilder buildA(String msg);
    abstract ProductBuilder buildB(String msg);
    abstract ProductBuilder buildC(String msg);
    abstract ProductBuilder buildD(String msg);

    abstract Product build();
}
