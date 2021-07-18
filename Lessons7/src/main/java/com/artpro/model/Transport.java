package com.artpro.model;
//подключили библиотеки lombok

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

@Getter
@Setter
@SuperBuilder
//в пакете моделей создали класс Транспорт
public class Transport {
    //В классе Транспорт есть поля:
//- Мощность(в лошадиных силах)
//- Максимальная скорость(км/ч)
//- Масса (кг)
//- Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )

    //Добавляем необходимые поля
    private double power; //объявили поле мощность
    private double maxSpeed; //объявили поле максимальной скорости
    private double weight; //объявили поле массы
    private String brand; //объявили поле марки

}
