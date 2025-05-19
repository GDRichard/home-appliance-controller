package com.medavie.assessment.controllers;

import com.medavie.assessment.models.requests.FanRequest;
import com.medavie.assessment.models.Fan;
import com.medavie.assessment.models.HomeAppliance;
import com.medavie.assessment.services.FanService;
import jakarta.validation.Valid;
import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping("/fan")
public class FanController {

    private final FanService fanService;

    FanController(FanService fanService) {
        this.fanService = fanService;
    }

    @PutMapping
    Fan putFan(@Valid @RequestBody FanRequest req) {
        return this.fanService.updateSettings(req);
    }

    @GetMapping
    Fan getFan() {
        return this.fanService.getSettings();
    }

    @GetMapping("/status")
    HomeAppliance.Power getPowerStatus() {
        return this.fanService.getSettings().getPower();
    }

}
