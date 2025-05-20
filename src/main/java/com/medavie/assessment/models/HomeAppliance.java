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

    boolean isPoweredOff() {
        return this.power == Power.OFF;
    }

    abstract void powerOff();

}
