package com.bupt.charger.service.impl.exception;

/**
 * @author ll （ created: 2023-05-26 19:46 )
 */
public class ApiException extends RuntimeException {

    public ApiException(String message) {
        super(message);
    }
}

