package com.artpro.service;

import com.artpro.model.Car;
import lombok.AllArgsConstructor;

@AllArgsConstructor
//1.1. имплементировали метод distanceCarPassedForAllTime из CarService
public class CarServiceImplements implements CarService {
    private final Car car;
    private final GasTankService gasTankService;
    private final MotorService motorService;

    public CarServiceImplements(Car car) {
        this.car = car;
        this.motorService = new MotorServiceImplements(car.getMotor());
        this.gasTankService = new GasTankServiceImplements(car.getGasTank());
    }

    @Override
    public void distanceCarPassedForAllTime() {
        //логично вызывать параметр из класса автомобиль (Car) - создадим там поле (1.2)
        //1.3 пишем логику метода
        System.out.println("За всё время машина прошла: " + car.getDistanceCarPassedForAllTime() + " км."); //без private Car car; до метода не достучались бы
    }

    @Override
    public void go() {
        if (motorService.isRunning()) {
            setCarMoving(true);
            setCarCurrentSpeed();
            System.out.println("Автомобиль поехал со скоростью " + car.getCurrentSpeed() + " км/ч");
        } else {
            System.out.println("Заведите двигатель");
        }
    }

    @Override
    public void stop() {
        if (isMoving()) {
            setCarMoving(false);
            int distance = car.getCurrentSpeed() * 8;
            car.setTraveledDistance(distance);
            updateTotalTraveledDistance(distance);
            System.out.println("Автомобиль остановился.");
        }
    }

    @Override
    public void startMotor() {
        if (!motorService.isRunning() && !gasTankService.isEmpty()) {
            motorService.start();
        } else if (!motorService.isRunning()) {
            System.out.println("Двигатель уже работает");
        } else if (!gasTankService.isEmpty()) {
            System.out.println("Заправьте автомобиль");
        }
    }

    @Override
    public void stopMotor() {
        if (motorService.isRunning() && !isMoving()) {
            motorService.stop();
        } else if (!motorService.isRunning()) {
            System.out.println("Двигатель не заведен");
        } else if (isMoving()) {
            System.out.println("Сначала остановите автомобиль");
        }

    }

    @Override
    public boolean isMoving() {
        return car.isMoving();
    }

    @Override
    public void showCurrentTraveledDistance() {
        System.out.println("Расстояние последней поездки: " + car.getTraveledDistance() + " км.");
    }

    @Override
    public void showTotalTraveledDistance() {
        System.out.println("Общий пробег автомобиля: " + car.getTotalTraveledDistance() + " км.");
    }

    @Override
    public void reFueling() {
        gasTankService.refuel();
    }

    private void setCarMoving(boolean isMove) {
        car.setMoving(isMove);
    }

    private void setCarCurrentSpeed() {
        car.setCurrentSpeed((int) (Math.random() * car.getMaxSpeed()));
    }

    private void updateTotalTraveledDistance(int distance) {
        car.setTotalTraveledDistance(car.getTotalTraveledDistance() + distance);
    }
}
