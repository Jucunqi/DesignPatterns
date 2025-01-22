package com.jcq.dp.bridge;

/**
 * 电脑的抽象类
 *
 * @author : jucunqi
 * @since : 2025/1/22
 */
public abstract class Computer {

    protected String name;

    protected Brand brand;

    public Computer(Brand brand) {
        this.brand = brand;
    }

    void brandInfo() {
        brand.brandName();
    }
}

class Ipad extends Computer{

    public Ipad(Brand brand) {
        super(brand);
    }

    @Override
    void brandInfo() {
        super.brandInfo();
        System.out.println("平板电脑");
    }
}

class Laptop extends Computer{

    public Laptop(Brand brand) {
        super(brand);
    }

    @Override
    void brandInfo() {
        super.brandInfo();
        System.out.println("笔记本电脑");
    }
}