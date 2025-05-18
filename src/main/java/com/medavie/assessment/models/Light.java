package com.medavie.assessment.models;

public class Light extends HomeAppliance {

    private static Light INSTANCE;

    private Light() {
        super();
        this.switchPosition = SwitchPosition.OFF;
    }

    public static Light getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Light();
        }
        return INSTANCE;
    }

    public enum SwitchPosition {
        ON,
        OFF
    }

    private SwitchPosition switchPosition;

    public void setLightSwitch(SwitchPosition switchPosition) {
        this.switchPosition = switchPosition;
        if (switchPosition == SwitchPosition.ON) {
            this.powerOn();
        } else {
            this.powerOff();
        }
    }

    public SwitchPosition getSwitchPosition() {
        return this.switchPosition;
    }

}
