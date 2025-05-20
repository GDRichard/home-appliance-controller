package com.medavie.assessment.services;

import com.medavie.assessment.models.requests.AirConditionerRequest;
import com.medavie.assessment.models.AirConditioner;
import org.springframework.stereotype.Service;

@Service
public class AirConditionerService {

    private final AirConditioner airConditioner;

    public AirConditionerService(AirConditioner airConditioner) {
        this.airConditioner = airConditioner;
    }

    public AirConditioner updateSettings(AirConditionerRequest req) {
        if (req.getTemperature() != null) this.airConditioner.setTemperature(req.getTemperature());
        if (req.getMode() != null) this.airConditioner.setMode(req.getMode());
        return this.airConditioner;
    }

    public AirConditioner getSettings() {
        return this.airConditioner;
    }

    public void powerOff() {
        this.airConditioner.powerOff();
    }
}
