package com.company.devices;

public class DialPhone extends AbstractPhone {
    boolean hasAnswerphone;

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

    public void autoAnswer() {
        System.out.println("autoAnswer");
    }
}
