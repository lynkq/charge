package com.bupt.charger.service;

import org.springframework.scheduling.annotation.Async;

public interface WsService {
    @Async
    void sendToUser(String username, String message);

    @Async
    void sendInfo(String message);
}
