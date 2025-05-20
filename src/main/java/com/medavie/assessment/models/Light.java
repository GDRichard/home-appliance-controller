package com.medavie.assessment.models;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Light extends HomeAppliance {

    public Light() {
        super();
        this.switchPosition = SwitchPosition.OFF;
    }

    public enum SwitchPosition {
        ON,
        OFF
    }

    private SwitchPosition switchPosition;

    public void setLightSwitch(SwitchPosition switchPosition) {
        this.switchPosition = switchPosition;
        if (switchPosition == SwitchPosition.ON) {
            this.setPower(Power.ON);
        } else {
            this.setPower(Power.OFF);
        }
    }

    public void powerOff() {
        this.switchPosition = SwitchPosition.OFF;
        this.setPower(Power.OFF);
    }

}
