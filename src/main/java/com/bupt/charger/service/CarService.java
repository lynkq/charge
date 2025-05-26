package com.bupt.charger.service;

import com.bupt.charger.dto.response.CarChargingResponse;
import com.bupt.charger.dto.response.CarStatusResponse;

public interface CarService {
    // -1 means error
    double updateDoneAmount(String carId);

    //6.获取车队列的状态。
    CarStatusResponse getCarStatus(String carId);

    //8. checkStatus，获取充电中的车的请求状态。
    CarChargingResponse getCarCharging(String carId);
}
