package com.medavie.assessment.models.requests;

import com.medavie.assessment.models.Light;
import jakarta.validation.constraints.NotNull;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LightRequest {

    @NotNull
    private Light.SwitchPosition switchPosition;

}
