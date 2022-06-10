package com.company.devices;

public class Mobile extends AbstractPhone {
    int simCount;
    String display;

    @Override
    public void powerOn() {
        System.out.println("powerOn");
    }

    @Override
    public void powerOff() {
        System.out.println("powerOff");
    }

    @Override
    public void call(int number) {
        System.out.println("call: " + number);
    }
}
