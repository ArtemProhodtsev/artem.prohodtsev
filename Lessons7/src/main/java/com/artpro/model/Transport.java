package com.artpro.model;
//подключили библиотеки lombok

import lombok.Getter;
import lombok.Setter;

//в пакете моделей создали класс Транспорт
public class Transport {
    //В классе Транспорт есть поля:
//- Мощность(в лошадиных силах)
//- Максимальная скорость(км/ч)
//- Масса (кг)
//- Марка( например: Audi, BMW , Boing, Airbus, Scania , МАЗ и т.д. )
    @Getter
    @Setter
//Добавляем необходимые поля
    private Integer power; //объявили поле можность
    private Integer maxSpeed; //объявили поле максимальной скорости
    private Integer weight; //объявили поле массы
    private String brand; //объявили поле марки

    //сгенерировали конструктор
    public Transport(Integer power, Integer maxSpeed, Integer weight, String brand) {
        this.power = power;
        this.maxSpeed = maxSpeed;
        this.weight = weight;
        this.brand = brand;
    }
}
