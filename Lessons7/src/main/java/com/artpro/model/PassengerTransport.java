package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.artpro.utils.Support.conversionOfPowerTokW;

//в пакете моделей создали класс легкового транспорта наследующегося от наземного
@Setter
@Getter
@SuperBuilder
public class PassengerTransport extends GroundTransport {
    //В классе Легковой добавляются поля:
//- Тип кузова
//- Кол-во пассажиров
    private Integer bodyType; //тип кузова
    private int numberOfPassengers; //количество пассажиров

//    В конечных классах (Легковой, Грузовой, Военный, Гражданский)
//    разработать метод описание который будет возвращать составленную строку
//    с описанием всех характеристик объекта. В строку включить ещё один
//    параметр мощность в киловаттах (кВ) .

    //создали метод toString для получения представления нашего объекта в виде строки
    //поля добавляем из класса GroundTransport + Transport: numberOfWheels, fuelСonsumption, power, maxSpeed, weight, brand
    //так же собственного класса PassengerTransport: bodyType, numberOfPassengers

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
                "body" + getBodyType() + ", " +
                "numberOfPassengers" + getNumberOfPassengers() + "человек, " +
                "} ";
    }

}


