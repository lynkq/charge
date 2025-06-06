package com.bupt.charger.dto.request;

import com.fasterxml.jackson.annotation.JsonProperty;
import lombok.Data;
import lombok.ToString;

/**
 * @author wyf（ created: 2023-06-03  16:03 )
 */
@Data
@ToString
public class DiePileRequest {
    @JsonProperty("pile_id")
    private String pileId;

}