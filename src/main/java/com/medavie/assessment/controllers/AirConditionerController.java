package com.medavie.assessment.controllers;

import com.medavie.assessment.models.requests.AirConditionerRequest;
import com.medavie.assessment.models.AirConditioner;
import com.medavie.assessment.models.HomeAppliance;
import com.medavie.assessment.services.AirConditionerService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/ac")
public class AirConditionerController {

    private final AirConditionerService airConditionerService;

    AirConditionerController(AirConditionerService airConditionerService) {
        this.airConditionerService = airConditionerService;
    }

    @PutMapping
    public AirConditioner updateAirConditionerSettings(@Valid @RequestBody AirConditionerRequest req) {
        return this.airConditionerService.updateSettings(req);
    }

    @GetMapping
    public AirConditioner getAirConditionerSettings() {
        return this.airConditionerService.getSettings();
    }

    @GetMapping("/status")
    public HomeAppliance.Power getPowerStatus() {
        return this.airConditionerService.getSettings().getPower();
    }

}
