package com.bupt.charger.service;

import com.bupt.charger.dto.request.ChargeReqRequest;
import com.bupt.charger.dto.request.ModifyChargeAmountRequest;
import com.bupt.charger.dto.request.ModifyChargeModeRequest;
import com.bupt.charger.dto.response.ChargeReqResponse;
import com.bupt.charger.entity.ChargingQueue;

public interface ChargeService {
    // 接收充电请求的所有处理
    ChargeReqResponse chargeRequest(ChargeReqRequest chargeReqRequest);

    void ModifyRequestAmount(ModifyChargeAmountRequest request);

    void ModifyRequestMode(ModifyChargeModeRequest request);

    void startCharging(String carId);

    // 这个时用户调用的停止充电请求，和故障管理员调用的不一样
    void stopCharging(String carId);
}
