package com.jcq.dp.state;

public class Person {

    public void say(State state) {
        state.say();
    }

    public void cry(State state) {
        state.cry();
    }
}
