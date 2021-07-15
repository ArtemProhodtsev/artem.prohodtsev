package com.artpro.model;

import lombok.Getter;
import lombok.Setter;

//класс гражданского траспорта с наследованием от воздушного
@Getter
@Setter
public class CivilTransport extends AirTransport {
    //- Кол-во пассажиров
//- Наличие бизнес класса (true/false)
    private Integer numberOfPassengers; //кол-во пассажиров
    private boolean businessСlass; //бизнес класс

    //сгенерировали конструктор

    public CivilTransport(Integer power, Integer maxSpeed, Integer weight, String brand, Integer numberOfPassengers, boolean businessСlass) {
        super(power, maxSpeed, weight, brand);
        this.numberOfPassengers = numberOfPassengers;
        this.businessСlass = businessСlass;
    }
}
