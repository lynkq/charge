package com.bupt.charger.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author wyf（ created: 2023-05-30  20:45 )
 */
@Data
@ToString
public class CheckChargerQueueRequest {
    @JsonProperty("pile_id")
    private String pileId;
}

