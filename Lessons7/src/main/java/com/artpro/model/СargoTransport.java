package com.artpro.model;

import lombok.Getter;
import lombok.Setter;

//класс грузового транспорта, наследование от наземного транспорта
@Setter
@Getter

public class СargoTransport extends GroundTransport {
    //В классе Грузовой добавляется  поле:
//- Грузоподъёмность(т)
    private Integer loadCapacity; //объявили поле грузоподъёмность

    //сгенерировали конструктор

    public СargoTransport(Integer power, Integer maxSpeed, Integer weight, String brand, Integer numberOfWheels, Integer fuelСonsumption, Integer loadCapacity) {
        super(power, maxSpeed, weight, brand, numberOfWheels, fuelСonsumption);
        this.loadCapacity = loadCapacity;
    }
}
