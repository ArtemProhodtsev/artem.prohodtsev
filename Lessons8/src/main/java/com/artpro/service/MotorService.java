package com.artpro.service;

public interface MotorService {
    void start(); //двигатель можно завести

    void stop(); //двигатель можно остановить

    boolean isRunning(); //запущен или не запущен двигатель
}
