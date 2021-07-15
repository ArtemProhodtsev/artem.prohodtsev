package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.artpro.utils.Support.conversionOfPowerTokW;

//класс грузового транспорта, наследование от наземного транспорта
@Setter
@Getter
@SuperBuilder

public class СargoTransport extends GroundTransport {
    //В классе Грузовой добавляется  поле:
//- Грузоподъёмность(т)
    private Integer loadCapacity; //объявили поле грузоподъёмность

    //создали метод toString для получения представления нашего объекта в виде строки
    //поля добавляем из класса GroundTransport + Transport: numberOfWheels, fuelСonsumption, power, maxSpeed, weight, brand
    //так же из собственного класса СargoTransport добавили: loadCapacity
    @Override
    public String toString() {
        return "PassengerTransport{" +
                "numberOfWheels" + getNumberOfWheels() + "шт, " + //через get() достукиваемся до поле в другом классе
                "fuelСonsumption" + getFuelСonsumption() + "литров/100км, " +
                "horsepower" + getPower() + "лошадиных сил " +
                "powerKW=" + conversionOfPowerTokW(getPower()) + " кВ), " + //используем метод конвертирования мощности, getPower() - подставляемый параметр
                "maxSpeed" + getPower() + "км/ч, " +
                "weight" + getWeight() + "кг, " +
                "brand" + getBrand() + ", " +
                "loadCapacity" + getLoadCapacity() + ", " +
                "} ";
    }
}
