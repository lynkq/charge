package com.bupt.charger.controller;

import com.bupt.charger.dto.ApiResp;
import com.bupt.charger.dto.request.LogoutRequest;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 用户登出
 */
@RestController
@RequestMapping("/user/logout")
public class LogoutController {

    @PostMapping
    public ResponseEntity<Object> logout(@RequestBody LogoutRequest request) {
        try {
            return ResponseEntity.ok().body(new ApiResp(0, "请求成功"));
        } catch (Exception e) {
            return ResponseEntity.ok().body(new ApiResp(1, e.getMessage()));
        }
    }

}
