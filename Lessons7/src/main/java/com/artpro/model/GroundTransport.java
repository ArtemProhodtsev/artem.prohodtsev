package com.artpro.model;
//подключили библиотеки lombok

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;


//в пакете моделей создали класс наземного транспорта, наследующегося от Transport
@Setter
@Getter
@SuperBuilder
public class GroundTransport extends Transport {
    //В классе Наземный добавляются поля:
//-Количество колёс
//-Расход топлива(л/100км)

    private double numberOfWheels; //объявили поле количество колёс
    private double fuelСonsumption; //объявили поле расход топлива


}
