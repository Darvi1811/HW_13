package com.company.devices;

import com.company.devices.DialPhone;
import com.company.devices.MultiCooker;
import com.company.devices.Oven;
import com.company.devices.SmartPhone;

public class Main {
    public static void lol(AbstractDevice[] args) {
        for (AbstractDevice object:
             args) {
            object.powerOff();
        }
    }

    public static void main(String[] args) {
        SmartPhone smartPhone = new SmartPhone();
        smartPhone.runApp();
        smartPhone.call(363457);
        smartPhone.powerOff();

        DialPhone dialPhone = new DialPhone();
        dialPhone.autoAnswer();
        dialPhone.call(532425);
        dialPhone.powerOff();

        Oven oven = new Oven();
        oven.initTimer(60);
        oven.cook();
        oven.powerOff();

        MultiCooker multiCooker = new MultiCooker();
        multiCooker.switchProgram(2);
        multiCooker.cook();
        multiCooker.powerOff();

        lol(new AbstractDevice[]{smartPhone, dialPhone, oven, multiCooker});
    }
}
