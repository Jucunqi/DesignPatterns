package com.jcq.dp.state;

public class BadState extends State{
    @Override
    void say() {
        System.out.println("bad say");
    }

    @Override
    void cry() {
        System.out.println("bad cry");
    }
}
