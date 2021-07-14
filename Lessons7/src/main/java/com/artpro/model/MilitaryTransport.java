package com.artpro.model;

import lombok.Getter;
import lombok.Setter;

//класс военного транспорта, наследование от воздушного
@Setter
@Getter
public class MilitaryTransport extends AirTransport {
    //- Наличие системы катапультирования (true/false)
//- Кол-во ракет на борту
    private boolean ejectionSystem; // наличие системы катапультирования
    private Integer numberOfMissilesOnBoard; //кол-во ракет на борту

    //сгенерировали конструктор
    public MilitaryTransport(Integer power, Integer maxSpeed, Integer weight, String brand, Integer wingspan, Integer minRunwayLength, boolean ejectionSystem, Integer numberOfMissilesOnBoard) {
        super(power, maxSpeed, weight, brand, wingspan, minRunwayLength);
        this.ejectionSystem = ejectionSystem;
        this.numberOfMissilesOnBoard = numberOfMissilesOnBoard;
    }
}

