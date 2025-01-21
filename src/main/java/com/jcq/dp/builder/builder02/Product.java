package com.jcq.dp.builder.builder02;

/**
 * 复杂产品
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public class Product {

    private String fieldA;
    private String fieldB;
    private String fieldC;
    private String fieldD;

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
