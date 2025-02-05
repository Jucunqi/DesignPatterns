package com.jcq.dp.observer.v3;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

/**
 * 观察者模式 - v3
 * 增加event继承关系
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
        WakeUpEvent event = new WakeUpEvent(new Date().getTime(), "bed", this);
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

interface Event<T> {

    T getSource();
}

class WakeUpEvent implements Event<Child>{

    long timestamp;
    String location;
    Child source;

    @Override
    public Child getSource() {
        return source;
    }

    public WakeUpEvent(long timestamp, String location, Child child) {
        this.source = child;
        this.timestamp = timestamp;
        this.location = location;
    }
}

class Dad implements Observer {

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        System.out.println("feed  feed feed");
        System.out.println("source ::::::" + event.getSource());
    }
}

class Mom implements Observer {

    @Override
    public void actionOnWakeUp(WakeUpEvent event) {
        System.out.println("hug hug hug");
    }
}

