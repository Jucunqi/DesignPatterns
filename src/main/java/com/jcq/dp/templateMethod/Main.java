package com.jcq.dp.templateMethod;

public class Main {

    public static void main(String[] args) {

        F f = new S();
        f.m();
    }
}

abstract class F{

    public void m() {
        op1();
        op2();
    }

    abstract void op1();

    abstract void op2();
}

class S extends F{
    @Override
    void op1() {
        System.out.println(1);
    }

    @Override
    void op2() {
        System.out.println(2);
    }
}
