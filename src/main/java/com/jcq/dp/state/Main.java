package com.jcq.dp.state;

/**
 * 状态模式
 *
 * @author : jucunqi
 * @since : 2025/2/6
 */
public class Main {

    public static void main(String[] args) {

        Person person = new Person();
        person.say(new HappyState());
    }
}


