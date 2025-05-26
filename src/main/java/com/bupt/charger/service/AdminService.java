package com.bupt.charger.service;

import com.bupt.charger.dto.request.*;
import com.bupt.charger.dto.response.AdminLoginResponse;
import com.bupt.charger.dto.response.CarResponse;
import com.bupt.charger.dto.response.CheckChargerResponse;
import com.bupt.charger.dto.response.InitDataBaseResponse;
import com.bupt.charger.service.impl.exception.ApiException;

import javax.security.auth.login.LoginException;
import java.util.List;

public interface AdminService {

    // 登录
    AdminLoginResponse login(String adminName, String password) throws LoginException;

    // 启动充电桩
    void startPile(StartPileRequest startPileRequest) throws ApiException;

    // 关闭充电桩
    void shutDownPile(ShutDownPileRequest shutDownPileRequest) throws ApiException;

    // 设置充电桩参数
    void setPileParameters(SetPileParametersRequest setPileParametersRequest) throws ApiException;

    CheckChargerResponse checkCharger(String pileId);

    List<CarResponse> checkChargerQueue(String pileId);

    InitDataBaseResponse initDataBase(InitDataBaseRequest initDataBaseRequest);

    void diePile(DiePileRequest diePileRequest) throws ApiException;
}
