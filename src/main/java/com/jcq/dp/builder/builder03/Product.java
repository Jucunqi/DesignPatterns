package com.jcq.dp.builder.builder03;

/**
 * 复杂产品
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Product {

    // 定义复杂属性
    private String fieldA;
    private String fieldB;
    private String fieldC;
    private String fieldD;

    /**
     * 定义内部类，用于构建复杂对象
     *
     * @author : jucunqi
     * @since : 2025/1/21
     */
    static class ProductBuilder{

        private final Product product;
        public ProductBuilder() {
            product = new Product();
        }

        ProductBuilder buildA(String msg) {
            product.setFieldA(msg);
            return this;
        }

        ProductBuilder buildB(String msg) {
            product.setFieldB(msg);
            return this;
        }
        ProductBuilder buildC(String msg) {
            product.setFieldC(msg);
            return this;
        }
        ProductBuilder buildD(String msg) {
            product.setFieldD(msg);
            return this;
        }

        Product build() {
            return product;
        }
    }


    @Override
    public String toString() {
        return "Product{" +
                "fieldA='" + fieldA + '\'' +
                ", fieldB='" + fieldB + '\'' +
                ", fieldC='" + fieldC + '\'' +
                ", fieldD='" + fieldD + '\'' +
                '}';
    }

    public void setFieldA(String fieldA) {
        this.fieldA = fieldA;
    }

    public void setFieldB(String fieldB) {
        this.fieldB = fieldB;
    }

    public void setFieldC(String fieldC) {
        this.fieldC = fieldC;
    }

    public void setFieldD(String fieldD) {
        this.fieldD = fieldD;
    }
}
