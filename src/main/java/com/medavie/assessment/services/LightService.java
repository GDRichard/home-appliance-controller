package com.medavie.assessment.services;

import com.medavie.assessment.models.Light;

import java.util.Arrays;

public class LightService {

    private final Light light;

    public LightService() {
        this.light = Light.getInstance();
    }

    public Light updateSettings(Light light) {
        if (light.getSwitchPosition() == null) {
            System.out.println("Invalid value for `switchPosition`. Must be one of: " + Arrays.toString(Light.SwitchPosition.values()));
        } else {
            this.light.setLightSwitch(light.getSwitchPosition());
        }
        return this.light;
    }

    public Light getSettings() {
        return this.light;
    }

    public void powerOff() {
        this.light.setLightSwitch(Light.SwitchPosition.OFF);
    }

}
