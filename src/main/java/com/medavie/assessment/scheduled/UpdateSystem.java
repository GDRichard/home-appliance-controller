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

    UpdateSystem(AirConditionerService airConditionerService, LightService lightService, FanService fanService) {
        this.airConditionerService = airConditionerService;
        this.lightService = lightService;
        this.fanService = fanService;
    }

    // Jan 1, 1:00am local time, yearly
    @Scheduled(cron = "0 0 1 1 1 ?")
    public void runYearlyUpdate() {
        airConditionerService.powerOff();
        lightService.powerOff();
        fanService.powerOff();
    }

}
