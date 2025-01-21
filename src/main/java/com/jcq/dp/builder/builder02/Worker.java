package com.jcq.dp.builder.builder02;

/**
 * 复杂产品的真实构建者
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Worker extends ProductBuilder{

    private final Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    ProductBuilder buildA(String msg) {
        product.setFieldA(msg);
        return this;
    }

    @Override
    ProductBuilder buildB(String msg) {
        product.setFieldB(msg);
        return this;
    }

    @Override
    ProductBuilder buildC(String msg) {
        product.setFieldC(msg);
        return this;
    }

    @Override
    ProductBuilder buildD(String msg) {
        product.setFieldD(msg);
        return this;
    }

    @Override
    Product build() {
        return product;
    }
}
