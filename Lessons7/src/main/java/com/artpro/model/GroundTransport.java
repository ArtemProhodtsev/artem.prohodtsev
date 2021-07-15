package com.artpro.model;
//подключили библиотеки lombok

import lombok.Getter;
import lombok.Setter;


//в пакете моделей создали класс наземного транспорта, наследующегося от Transport
@Setter
@Getter

public class GroundTransport extends Transport {
    //В классе Наземный добавляются поля:
//-Количество колёс
//-Расход топлива(л/100км)

    private Integer numberOfWheels; //объявили поле количество колёс
    private Integer fuelСonsumption; //объявили поле расход топлива

    //сгенерировали конструктор

    public GroundTransport(Integer power, Integer maxSpeed, Integer weight, String brand, Integer numberOfWheels, Integer fuelСonsumption) {
        super(power, maxSpeed, weight, brand);
        this.numberOfWheels = numberOfWheels;
        this.fuelСonsumption = fuelСonsumption;
    }
}
