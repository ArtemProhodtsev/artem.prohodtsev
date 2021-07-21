package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

//Создали класс двигатель
@Getter
@Setter
@ToString
public class Motor {
    private String typeMotor; //тип двигателя

    public Motor(String typeMotor) {
        this.typeMotor = typeMotor;
    }

}
