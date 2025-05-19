package com.medavie.assessment.services;

import com.medavie.assessment.models.requests.LightRequest;
import com.medavie.assessment.models.Light;
import org.springframework.stereotype.Service;

@Service
public class LightService {

    private final Light light;

    public LightService(Light light) {
        this.light = light;
    }

    public Light updateSettings(LightRequest req) {
        this.light.setLightSwitch(req.getSwitchPosition());
        return this.light;
    }

    public Light getSettings() {
        return this.light;
    }

    public void powerOff() {
        this.light.setLightSwitch(Light.SwitchPosition.OFF);
    }

}
