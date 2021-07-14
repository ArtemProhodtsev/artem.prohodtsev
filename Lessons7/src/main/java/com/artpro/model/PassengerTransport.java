package com.artpro.model;

import lombok.Getter;
import lombok.Setter;

//в пакете моделей создали класс легкового транспорта наследующегося от наземного
@Setter
@Getter
public class PassengerTransport extends GroundTransport {
    //В классе Легковой добавляются поля:
//- Тип кузова
//- Кол-во пассажиров
    private Integer bodyType; //тип кузова
    private int numberOfPassengers; //количество пассажиров

//    В конечных классах (Легковой, Грузовой, Военный, Гражданский)
//    разработать метод описание который будет возвращать составленную строку
//    с описанием всех характеристик объекта. В строку включить ещё один
//    параметр мощность в киловаттах (кВ) .

    //сгенерировали конструктор
    public PassengerTransport(Integer power, Integer maxSpeed, Integer weight, String brand, Integer numberOfWheels, Integer fuelСonsumption, Integer bodyType, int numberOfPassengers) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelСonsumption);
        this.bodyType = bodyType;
        this.numberOfPassengers = numberOfPassengers;
    }
}


