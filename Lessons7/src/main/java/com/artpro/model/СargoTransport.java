package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

//класс грузового транспорта, наследование от наземного транспорта
@Setter
@Getter
@SuperBuilder

public class СargoTransport extends GroundTransport {
    //В классе Грузовой добавляется  поле:
//- Грузоподъёмность(т)
    private Integer loadCapacity; //объявили поле грузоподъёмность


}
