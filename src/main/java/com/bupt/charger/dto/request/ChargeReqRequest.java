package com.bupt.charger.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author ll （ created: 2023-05-27 17:59 )
 */
@Data
@ToString
public class ChargeReqRequest {
    @JsonProperty("car_id")
    private String carId;

    @JsonProperty("request_amount")
    private double requestAmount;

    @JsonProperty("request_mode")
    private String requestMode;
}
