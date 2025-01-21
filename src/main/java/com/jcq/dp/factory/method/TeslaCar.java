package com.jcq.dp.factory.method;

import com.jcq.dp.factory.method.Car;

public class TeslaCar implements Car {

    @Override
    public void name() {
        System.out.println("特斯拉！");
    }
}
