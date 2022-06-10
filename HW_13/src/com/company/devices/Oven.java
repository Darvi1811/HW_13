package com.company.devices;

public class Oven extends AbstractMultiCooker {
    @Override
    public void cook() {
        System.out.println("cook");
    }

    public void initTimer(int int1) {
        System.out.println("initTimer: " + int1);
    }
}
