package com.jcq.dp.builder.builder01;

/**
 * 产品的抽象构建者
 *
 * @author : jucunqi
 * @since : 2025/1/21
 */
public abstract class ProductBuilder {

    // 定义抽象方法，一步步创建复杂对象
    abstract void buildA(String msg);
    abstract void buildB(String msg);
    abstract void buildC(String msg);
    abstract void buildD(String msg);

    // 返回产品对象
    abstract Product build();
}
