package com.entertainment.client;

import com.entertainment.Television;

public class TelevisionClient {

    public static void main(String[] args) {

        Television tv1 = new Television();

        tv1.setBrand("Sony");
        tv1.setVolume(25);

        tv1.turnOn();
        tv1.turnOff();

        System.out.println(tv1);

        Television tv2 = new Television();
        tv2.setBrand("Samsung");
        tv2.setVolume(10);

        tv1.turnOn();
        tv1.turnOff();

        tv2.turnOn();
        tv2.turnOff();
    }
}