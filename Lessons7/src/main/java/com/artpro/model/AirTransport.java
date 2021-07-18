package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

//в пакете моделей создали класс воздушного транспорта, наследующегося от Transport
@Setter
@Getter
@SuperBuilder
public class AirTransport extends Transport {
    //В классе Воздушный добавляются поля:
//- Размах крыльев (м)
//- Минимальная длина взлётно-посадочной полосы для взлёта
    private double wingspan; //размах крыльев
    private double minRunwayLength; //длина взлётно-посадочной

}

