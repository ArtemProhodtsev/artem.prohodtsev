package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//создали класс Машина
@Getter
@Setter
@ToString
public class Car {
    //добавляем поля присущие классу Машина
    private final Motor motor; //поле (свойство) будет не изменяемое, делаем его final
    //для motor мы не сможем использовать set (ложить в него значения), а только get - получать
    private GasTank gasTank; //топливный бак
    private int distanceCarPassedForAllTime; //1.2 создали для определения дистанции
    private boolean isMoving;
    private int maxSpeed;
    private int currentSpeed;
    private int traveledDistance;
    private int totalTraveledDistance;

    //сгенерируем конструктор на основе полей motor и gasTank
    public Car(Motor motor, GasTank gasTank) {
        this.motor = motor;
        this.gasTank = gasTank;
    }
}
