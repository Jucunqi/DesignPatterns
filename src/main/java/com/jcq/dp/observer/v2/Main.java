package com.jcq.dp.observer.v2;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 观察者模式 - v2
 * 添加Event类
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
        WakeUpEvent event = new WakeUpEvent(new Date().getTime(), "bed");
        for (Observer observer : observerList) {
            observer.actionOnWakeUp(event);
        }
    }
}

interface Observer{

    /**
     * 当醒来时候的操作
     */
    void actionOnWakeUp(WakeUpEvent event);
}

class WakeUpEvent{

    long timestamp;
    String location;

    public WakeUpEvent(long timestamp, String location) {
        this.timestamp = timestamp;
        this.location = location;
    }
}

class Dad implements Observer {

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        System.out.println("feed  feed feed");
    }
}

class Mom implements Observer {

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        System.out.println("hug hug hug");
    }
}
