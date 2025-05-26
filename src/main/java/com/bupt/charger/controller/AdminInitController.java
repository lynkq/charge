package com.bupt.charger.controller;


import com.bupt.charger.dto.ApiResp;
import com.bupt.charger.dto.request.InitDataBaseRequest;
import com.bupt.charger.service.AdminService;
import io.swagger.v3.oas.annotations.Operation;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

/**
 * 管理员初始化数据库
 */


@RestController
@RequestMapping("/admin")
public class AdminInitController {

    @Autowired
    private AdminService adminService;

    @PostMapping("/initDataBase")
    @Operation(summary = "管理员初始化数据库")
    public ResponseEntity<Object> initDataBase(@RequestBody InitDataBaseRequest initDataBaseRequest) {
        try {
            adminService.initDataBase(initDataBaseRequest);
            return ResponseEntity.ok().body(new ApiResp(0, "请求成功"));
        } catch (Exception e) {
            return ResponseEntity.ok().body(new ApiResp(1, e.getMessage()));
        }
    }
}
