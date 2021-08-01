package com.artpro.service;

import com.artpro.model.Motor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MotorServiceImplements implements MotorService {
    private final Motor motor;

    @Override
    public void start() {
        if (!isRunning()) { //проверяем а вдруг двигатель запущен
            motor.setRunning(true);  //указываем true = запущен
            System.out.println("Двигатель заведен");
        } else {
            System.out.println("Двигатель уже работает");
        }
    }

    @Override
    public void stop() {
        if (isRunning()) {
            motor.setRunning(false);
            System.out.println("Двигатель заглушен");
        } else {
            System.out.println("Двигатель уже не работает");
        }
    }

    @Override
    public boolean isRunning() {
        return motor.isRunning();
    }
}
