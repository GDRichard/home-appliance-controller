package com.medavie.assessment.models.requests;

import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class FanRequest {

    @Min(0)
    @Max(2)
    private int speed;

}
