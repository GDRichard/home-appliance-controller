package com.medavie.assessment.models;

import lombok.Getter;
import lombok.Setter;
import org.springframework.stereotype.Component;

@Getter
@Component
public class AirConditioner extends HomeAppliance {

    public AirConditioner() {
        super();
        this.mode = Mode.OFF;
        this.temperature = 21;
    }

    public enum Mode {
        COOL,
        HEAT,
        DRY,
        FAN,
        AUTO,
        OFF
    }

    private Mode mode;

    @Setter
    private int temperature;

    public void setMode(Mode mode) {
        this.mode = mode;
        if (mode == Mode.OFF) {
            this.setPower(Power.OFF);
        } else {
            this.setPower(Power.ON);
        }
    }

    public void powerOff() {
        this.mode = Mode.OFF;
        this.setPower(Power.OFF);
    }

}
