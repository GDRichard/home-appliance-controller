package com.medavie.assessment.models.requests;

import com.medavie.assessment.models.AirConditioner;
import jakarta.validation.constraints.Max;
import jakarta.validation.constraints.Min;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class AirConditionerRequest {

    private AirConditioner.Mode mode;

    @Min(16)
    @Max(30)
    private Integer temperature;

}
