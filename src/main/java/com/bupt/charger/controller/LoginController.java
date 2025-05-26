package com.bupt.charger.controller;

import com.bupt.charger.dto.ApiResp;
import com.bupt.charger.dto.request.LoginRequest;
import com.bupt.charger.dto.response.UserLoginResponse;
import com.bupt.charger.service.UserService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登录
 */
@RestController
@Tag(name = "登录")
@RequestMapping("/login")
public class LoginController {

    @Autowired
    private UserService userService;

    @PostMapping
    @Operation(summary = "用户登录")
    public ResponseEntity<Object> userLogin(@RequestBody LoginRequest loginRequest) {
        try {
            UserLoginResponse loginResponse = userService.login(loginRequest.getUsername(), loginRequest.getPassword());
            return ResponseEntity.ok().body(new ApiResp(0, "请求成功", loginResponse));
        } catch (Exception e) {
            return ResponseEntity.ok().body(new ApiResp(1, e.getMessage()));
        }
    }

}
