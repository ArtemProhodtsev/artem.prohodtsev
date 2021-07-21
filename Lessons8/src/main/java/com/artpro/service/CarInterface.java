package com.artpro.service;

public class CarInterface implements CarService {
    private MotorService motorService;

    public CarInterface(MotorService motorService) {
        this.motorService = motorService;
    }

    @Override
    public boolean isMotorWork() {
        return motorService.work();
    }
}
