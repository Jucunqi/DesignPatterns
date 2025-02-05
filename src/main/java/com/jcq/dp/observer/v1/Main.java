package com.jcq.dp.observer.v1;

import java.util.ArrayList;
import java.util.List;

/**
 * 观察者模式 - v1
 * 与责任链模式很相似，不过责任链模式可以在执行到某一环节的时候选择 中断执行
 *
 * @author : jucunqi
 * @since : 2025/2/5
 */
public class Main {

    public static void main(String[] args) {

        Child child = new Child();
        child.wakeUp();
    }
}

class Child{

    List<Observer> observerList;
    {
        observerList = new ArrayList<>();
        observerList.add(new Dad());
        observerList.add(new Mom());
    }
    void wakeUp() {
        System.out.println("Wake up crying ，wuwuwuwu");
        for (Observer observer : observerList) {
            observer.actionOnWakeUp();
        }
    }
}

interface Observer{

    /**
     * 当醒来时候的操作
     */
    void actionOnWakeUp();
}

class Dad implements Observer{

    @Override
    public void actionOnWakeUp() {
        System.out.println("feed  feed feed");
    }
}

class Mom implements Observer {

    @Override
    public void actionOnWakeUp() {
        System.out.println("hug hug hug");
    }
}