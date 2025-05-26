package com.bupt.charger.controller;

import com.bupt.charger.dto.ApiResp;
import com.bupt.charger.dto.request.AdminLoginRequest;
import com.bupt.charger.dto.response.AdminLoginResponse;
import com.bupt.charger.service.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import io.swagger.v3.oas.annotations.tags.Tag;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员登录
 */
@RestController
@Tag(name = "登录")
@RequestMapping("/admin/login")
public class AdminLoginController {

    @Autowired
    private AdminService adminService;

    @PostMapping
    @Operation(summary = "管理员登录")
    public ResponseEntity<Object> adminLogin(@RequestBody AdminLoginRequest adminLoginRequest) {
        try {
            AdminLoginResponse adminLoginResponse = adminService.login(adminLoginRequest.getAdminName(), adminLoginRequest.getPassword());
            return ResponseEntity.ok().body(new ApiResp(0, "请求成功", adminLoginResponse));
        } catch (Exception e) {
            return ResponseEntity.ok().body(new ApiResp(1, e.getMessage()));
        }
    }

}
