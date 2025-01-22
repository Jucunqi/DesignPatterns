package com.jcq.dp.bridge;

public class Test {
    public static void main(String[] args) {

        Brand brand = new Apple();
        Computer ipad = new Ipad(brand);
        ipad.brandInfo();

        Computer laptop = new Laptop(brand);
        laptop.brandInfo();
    }
}
