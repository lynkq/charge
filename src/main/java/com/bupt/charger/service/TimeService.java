package com.bupt.charger.service;

import com.bupt.charger.dto.response.GetTimeNowResponse;
import com.bupt.charger.service.impl.exception.ApiException;

public interface TimeService {
    GetTimeNowResponse getTimeNow() throws ApiException;
}
