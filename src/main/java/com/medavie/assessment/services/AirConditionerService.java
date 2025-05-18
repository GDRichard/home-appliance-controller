package com.medavie.assessment.services;

import com.medavie.assessment.models.AirConditioner;

import java.util.Arrays;

public class AirConditionerService {

    private final AirConditioner airConditioner;

    public AirConditionerService() {
        this.airConditioner = AirConditioner.getInstance();
    }

    public AirConditioner updateSettings(AirConditioner ac) {
        this.updateTemperature(ac.getTemperature());
        this.updateMode(ac.getMode());
        return this.airConditioner;
    }

    private void updateTemperature(int temperature) {
        if (temperature < 16 || temperature > 30) {
            System.out.println("Invalid or missing temperature. Value must be between 16 and 30 inclusive.");
        } else {
            airConditioner.setTemperature(temperature);
        }
    }

    private void updateMode(AirConditioner.Mode mode) {
        if (mode == null) {
            System.out.println("Invalid or missing mode. Must be one of: " + Arrays.toString(AirConditioner.Mode.values()));
        } else {
            airConditioner.setMode(mode);
        }
    }

    public AirConditioner getSettings() {
        return this.airConditioner;
    }

    public void powerOff() {
        this.airConditioner.setMode(AirConditioner.Mode.OFF);
    }
}
