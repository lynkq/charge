package com.bupt.charger.service;

import com.bupt.charger.dto.request.UserRegistrationRequest;
import com.bupt.charger.dto.response.UserLoginResponse;
import com.bupt.charger.service.impl.exception.ApiException;

import javax.security.auth.login.LoginException;

public interface UserService {
    void registerUser(UserRegistrationRequest registrationRequest) throws ApiException;

    UserLoginResponse login(String username, String password) throws LoginException;
}
