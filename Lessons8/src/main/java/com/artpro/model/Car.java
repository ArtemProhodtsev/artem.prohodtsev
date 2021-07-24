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
    private Motor motor; //мотор
    private GasTank gasTank; //топливный бак
    private int distanceCarPassedForAllTime; //1.2 создали для определения дистанции

    //сгенерируем конструктор на основе полей motor и gasTank
    public Car(Motor motor, GasTank gasTank) {
        this.motor = motor;
        this.gasTank = gasTank;
    }
}
