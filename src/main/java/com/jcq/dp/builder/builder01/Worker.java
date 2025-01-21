package com.jcq.dp.builder.builder01;

/**
 * 产品的实际构建者
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Worker extends ProductBuilder {

    private final Product product;

    public Worker() {
        product = new Product();
    }

    @Override
    void buildA(String msg) {
        product.setFieldA(msg);
    }

    @Override
    void buildB(String msg) {
        product.setFieldB(msg);
    }

    @Override
    void buildC(String msg) {
        product.setFieldC(msg);
    }

    @Override
    void buildD(String msg) {
        product.setFieldD(msg);
    }

    @Override
    Product build() {
        return product;
    }
}
