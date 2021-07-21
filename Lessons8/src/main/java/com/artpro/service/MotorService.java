package com.artpro.service;
//создал интерфейс в котором опишу действия и состояния присущие мотору. потом эти методы
//будут описаны в классе MotorInterface
public interface MotorService {
    void start(); //двигатель включается

    void stop(); //двигатель останавливается

    boolean work(); //состояние работы
}

