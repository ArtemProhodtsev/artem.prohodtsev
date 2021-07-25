package com.artpro.service;
//класс интерфейса автомобиля
public interface CarService {
    //1. метод который буду реализовывать по задаче:
//     - Реализовать возможность посмотреть, какое расстояние машина прошла за все время.
    void distanceCarPassedForAllTime();

    void go(); //машина может поехать

    void stop(); //машина может остановиться

    void startMotor(); //завести двигатель

    void stopMotor(); //остановить двигатель

    boolean isMoving();

    void showCurrentTraveledDistance();

    void showTotalTraveledDistance();

    void reFueling();

}
