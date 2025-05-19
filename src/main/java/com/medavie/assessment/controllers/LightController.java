package com.medavie.assessment.controllers;

import com.medavie.assessment.models.requests.LightRequest;
import com.medavie.assessment.models.HomeAppliance;
import com.medavie.assessment.models.Light;
import com.medavie.assessment.services.LightService;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/light")
public class LightController {

    private final LightService lightService;

    LightController(LightService lightService) {
        this.lightService = lightService;
    }

    @PutMapping
    Light updateLightSettings(@RequestBody LightRequest req) {
        return this.lightService.updateSettings(req);
    }

    @GetMapping
    public Light getLightSettings() {
        return this.lightService.getSettings();
    }

    @GetMapping("/status")
    public HomeAppliance.Power getPowerStatus() {
        return this.lightService.getSettings().getPower();
    }

}
