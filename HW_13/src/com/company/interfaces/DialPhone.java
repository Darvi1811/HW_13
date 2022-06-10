package com.company.interfaces;

public class DialPhone implements Caller {
    @Override
    public void call(int number) {
        System.out.println("call: " + number);
    }
}
