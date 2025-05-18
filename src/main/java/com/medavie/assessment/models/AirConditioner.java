package com.medavie.assessment.models;

public class AirConditioner extends HomeAppliance {

    private static AirConditioner INSTANCE;

    private AirConditioner() {
        super();
        this.mode = Mode.OFF;
        this.temperature = 21;
    }

    public static AirConditioner getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new AirConditioner();
        }
        return INSTANCE;
    }

    public enum Mode {
        COOL,
        HEAT,
        DRY,
        FAN,
        AUTO,
        OFF
    }

    private Mode mode;
    private int temperature;

    public void setMode(Mode mode) {
        this.mode = mode;
        if (mode == Mode.OFF) {
            this.powerOff();
        } else {
            this.powerOn();
        }
    }

    public Mode getMode() {
        return this.mode;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }

    public int getTemperature() {
        return this.temperature;
    }

}
