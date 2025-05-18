package com.medavie.assessment.controllers;

import com.medavie.assessment.models.Fan;
import com.medavie.assessment.models.HomeAppliance;
import com.medavie.assessment.services.FanService;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class FanController {

    private final FanService fanService;

    FanController() {
        this.fanService = new FanService();
    }

    @PutMapping("/fan")
    Fan putFan(@RequestBody Fan fan) {
        return this.fanService.updateSettings(fan);
    }

    @GetMapping("/fan")
    Fan getFan() {
        return this.fanService.getSettings();
    }

    @GetMapping("/fan/status")
    HomeAppliance.Power getPowerStatus() {
        return this.fanService.getSettings().getPower();
    }

}
