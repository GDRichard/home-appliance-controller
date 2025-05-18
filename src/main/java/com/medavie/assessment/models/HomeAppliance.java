package com.medavie.assessment.models;

public class HomeAppliance {

    protected HomeAppliance() {
        this.power = Power.OFF;
    }

    public enum Power {
        ON,
        OFF
    }

    private Power power;

    public void setPower(Power power) {
        this.power = power;
    }

    public Power getPower() {
        return this.power;
    }

    protected void powerOn() {
        this.power = Power.ON;
    }

    protected void powerOff() {
        this.power = Power.OFF;
    }

    protected boolean isPoweredOff() {
        return this.power == Power.OFF;
    }

}
