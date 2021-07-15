package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

//класс гражданского траспорта с наследованием от воздушного
@Getter
@Setter
@SuperBuilder
public class CivilTransport extends AirTransport {
    //- Кол-во пассажиров
//- Наличие бизнес класса (true/false)
    private Integer numberOfPassengers; //кол-во пассажиров
    private boolean businessСlass; //бизнес класс


}
