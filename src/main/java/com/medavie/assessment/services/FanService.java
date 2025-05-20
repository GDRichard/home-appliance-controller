package com.medavie.assessment.services;

import com.medavie.assessment.models.requests.FanRequest;
import com.medavie.assessment.models.Fan;
import org.springframework.stereotype.Service;

@Service
public class FanService {

    private final Fan fan;

    public FanService(Fan fan) {
        this.fan = fan;
    }

    public Fan updateSettings(FanRequest req) {
        this.fan.setSpeed(req.getSpeed());
        return this.fan;
    }

    public Fan getSettings() {
        return this.fan;
    }

    public void powerOff() {
        this.fan.powerOff();
    }

}
