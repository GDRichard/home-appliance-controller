package com.medavie.assessment.controllers;

import com.medavie.assessment.models.HomeAppliance;
import com.medavie.assessment.models.Light;
import com.medavie.assessment.services.LightService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class LightController {

    private final LightService lightService;

    LightController() {
        this.lightService = new LightService();
    }

    @PutMapping("/light")
    Light updateLightSettings(@RequestBody Light light) {
        return this.lightService.updateSettings(light);
    }

    @GetMapping("/light")
    public Light getLightSettings() {
        return this.lightService.getSettings();
    }

    @GetMapping("/light/status")
    public HomeAppliance.Power getPowerStatus() {
        return this.lightService.getSettings().getPower();
    }

}
