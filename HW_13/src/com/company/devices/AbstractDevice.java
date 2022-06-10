package com.company.devices;

abstract class AbstractDevice {
    String name;
    int serialNumber;

    public abstract void powerOn();
    public abstract void powerOff();

    public AbstractDevice() {
        powerOn();
    }
}
