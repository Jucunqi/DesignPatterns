package com.jcq.dp.adapter.v2;

public class Main {


    public static void main(String[] args) {

        ChinaV chinaV = new ChinaV();
        HongkongV hongkongV = new HongkongV();
        Adapter adapter = new Adapter(chinaV);
        adapter.run(hongkongV);
    }


}
