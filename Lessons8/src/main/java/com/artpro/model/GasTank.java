package com.artpro.model;
//Создали класс бензобак

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

@Getter
@Setter
@ToString
public class GasTank {
    //добавляем поля присущие бензобаку
    //по задаче это: общий объем бензобака, сколько бензина сейчас
    private final int volumeGasTank; //объём бензобака, он будет final так как изменяться не будет
    private int levelGasTank; //уровень бензина

    //создали констуктор
    public GasTank(int volumeGasTank) {
        this.volumeGasTank = volumeGasTank;
    }
}
