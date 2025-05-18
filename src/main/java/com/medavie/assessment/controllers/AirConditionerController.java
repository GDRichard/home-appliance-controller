package com.medavie.assessment.controllers;

import com.medavie.assessment.models.AirConditioner;
import com.medavie.assessment.models.HomeAppliance;
import com.medavie.assessment.services.AirConditionerService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class AirConditionerController {

    private final AirConditionerService airConditionerService;

    AirConditionerController() {
        this.airConditionerService = new AirConditionerService();
    }

    @PutMapping("/ac")
    public AirConditioner putAirConditionerSettings(@RequestBody AirConditioner ac) {
        return this.airConditionerService.updateSettings(ac);
    }

    @GetMapping("/ac")
    public AirConditioner getAirConditionerSettings() {
        return this.airConditionerService.getSettings();
    }

    @GetMapping("/ac/status")
    public HomeAppliance.Power getPowerStatus() {
        return this.airConditionerService.getSettings().getPower();
    }

}
