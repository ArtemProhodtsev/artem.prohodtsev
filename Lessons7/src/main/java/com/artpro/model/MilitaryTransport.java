package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.artpro.utils.Support.conversionOfPowerTokW;

//класс военного транспорта, наследование от воздушного
@Setter
@Getter
@SuperBuilder
public class MilitaryTransport extends AirTransport {
    //- Наличие системы катапультирования (true/false)
//- Кол-во ракет на борту
    private boolean ejectionSystem; // наличие системы катапультирования
    private Integer numberOfMissilesOnBoard; //кол-во ракет на борту

    //создали метод toString для получения представления нашего объекта в виде строки
    //поля добавляем из класса AirTransport + Transport: wingspan, minRunwayLength, power, maxSpeed, weight, brand
    //так же из собственного класса CivilTransport добавили: ejectionSystem, numberOfMissilesOnBoard
    @Override
    public String toString() {
        return "PassengerTransport{" +
                "wingspan" + getWingspan() + "м, " + //через get() достукиваемся до поле в другом классе
                "minRunwayLength" + getMinRunwayLength() + ", " +
                "horsepower" + getPower() + "лошадиных сил " +
                "powerKW=" + conversionOfPowerTokW(getPower()) + " кВ), " + //используем метод конвертирования мощности, getPower() - подставляемый параметр
                "maxSpeed" + getPower() + "км/ч, " +
                "weight" + getWeight() + "кг, " +
                "brand" + getBrand() + ", " +
                "ejectionSystem" + isEjectionSystem() +
                "numberOfMissilesOnBoard" + getNumberOfMissilesOnBoard() + ", " +
                "} ";
    }

}

