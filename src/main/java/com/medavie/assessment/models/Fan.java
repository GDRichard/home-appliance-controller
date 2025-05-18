package com.medavie.assessment.models;

public class Fan extends HomeAppliance {

    private static Fan INSTANCE;

    private Fan() {
        super();
        this.speed = 0;
    }

    public static Fan getInstance() {
        if (INSTANCE == null) {
            INSTANCE = new Fan();
        }
        return INSTANCE;
    }

    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed == 0) {
            this.powerOff();
        } else if (this.isPoweredOff()) {
            this.powerOn();
        }
    }

    public int getSpeed() {
        return this.speed;
    }

}
