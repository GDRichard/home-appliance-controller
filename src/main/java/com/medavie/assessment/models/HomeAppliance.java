package com.medavie.assessment.models;

import lombok.Data;

@Data
public abstract class HomeAppliance {

    HomeAppliance() {
        this.power = Power.OFF;
    }

    public enum Power {
        ON,
        OFF
    }

    private Power power;

    void powerOn() {
        this.power = Power.ON;
    }

    void powerOff() {
        this.power = Power.OFF;
    }

    boolean isPoweredOff() {
        return this.power == Power.OFF;
    }

}
