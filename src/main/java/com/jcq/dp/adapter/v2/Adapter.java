package com.jcq.dp.adapter.v2;

public class Adapter {

    private ChinaV chinaV;

    public Adapter(ChinaV chinaV) {
        this.chinaV = chinaV;
    }

    public void run(HongkongV hongkongV) {

        chinaV.run();
        System.out.println("进行转换 --- 220V -> 110V");
        hongkongV.run();
    }
}
