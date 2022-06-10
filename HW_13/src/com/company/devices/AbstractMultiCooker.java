package com.company.devices;

abstract class AbstractMultiCooker extends AbstractDevice {
    @Override
    public void powerOn() {
        System.out.println("powerOn");
    }
    @Override
    public void powerOff() {
        System.out.println("powerOff");
    }

    abstract void cook();
}
