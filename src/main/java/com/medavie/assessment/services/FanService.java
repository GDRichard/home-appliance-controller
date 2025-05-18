package com.medavie.assessment.services;

import com.medavie.assessment.models.Fan;

public class FanService {

    private final Fan fan;

    public FanService() {
        this.fan = Fan.getInstance();
    }

    public Fan updateSettings(Fan fan) {
        if (fan.getSpeed() < 0 || fan.getSpeed() > 2) {
            System.out.println("Invalid or missing fan speed: must be a value between 0 and 2 inclusive.");
        } else {
            this.fan.setSpeed(fan.getSpeed());
        }
        return this.fan;
    }

    public Fan getSettings() {
        return this.fan;
    }

    public void powerOff() {
        this.fan.setSpeed(0);
    }

}
