package com.medavie.assessment.models;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Component
@Getter
public class Fan extends HomeAppliance {

    public Fan() {
        super();
        this.speed = 0;
    }

    private int speed;

    public void setSpeed(int speed) {
        this.speed = speed;
        if (speed == 0) {
            this.setPower(Power.OFF);
        } else if (this.isPoweredOff()) {
            this.setPower(Power.ON);
        }
    }

    public void powerOff() {
        this.speed = 0;
        this.setPower(Power.OFF);
    }

}
