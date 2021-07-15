package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

//класс военного транспорта, наследование от воздушного
@Setter
@Getter
@SuperBuilder
public class MilitaryTransport extends AirTransport {
    //- Наличие системы катапультирования (true/false)
//- Кол-во ракет на борту
    private boolean ejectionSystem; // наличие системы катапультирования
    private Integer numberOfMissilesOnBoard; //кол-во ракет на борту


}

