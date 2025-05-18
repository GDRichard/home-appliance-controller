package com.medavie.assessment.scheduled;

import com.medavie.assessment.services.AirConditionerService;
import com.medavie.assessment.services.FanService;
import com.medavie.assessment.services.LightService;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;

@Component
public class UpdateSystem {

    AirConditionerService airConditionerService;
    LightService lightService;
    FanService fanService;

    UpdateSystem() {
        airConditionerService = new AirConditionerService();
        lightService = new LightService();
        fanService = new FanService();
    }

    @Scheduled(cron = "0 0 1 1 1 *")
    public void runYearlyUpdate() {
        airConditionerService.powerOff();
        lightService.powerOff();
        fanService.powerOff();
    }

}
