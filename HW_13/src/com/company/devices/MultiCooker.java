package com.company.devices;

public class MultiCooker extends AbstractMultiCooker {
    @Override
    public void cook() {
        System.out.println("cook");
    }

    public void switchProgram(int int1) {
        System.out.println("switchProgram: " + int1);
    }
}
