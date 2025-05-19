package com.medavie.assessment.models.requests;

import com.medavie.assessment.models.Light;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@AllArgsConstructor
@NoArgsConstructor
public class LightRequest {

    private Light.SwitchPosition switchPosition;

}
