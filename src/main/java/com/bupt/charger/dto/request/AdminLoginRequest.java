package com.bupt.charger.dto.request;


import lombok.Data;
import lombok.ToString;

/**
 * @author wyf（ created: 2023-05-29 14:02 )
 */
@Data
@ToString
public class AdminLoginRequest {
    private String adminName;
    private String password;
}
