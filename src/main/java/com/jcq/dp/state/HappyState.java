package com.jcq.dp.state;

public class HappyState extends State{

    @Override
    void say() {
        System.out.println("happy  say");
    }

    @Override
    void cry() {

        System.out.println("happy  cry");
    }
}
