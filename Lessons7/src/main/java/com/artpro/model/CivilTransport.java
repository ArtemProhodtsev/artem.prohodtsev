package com.artpro.model;

import lombok.Getter;
import lombok.Setter;
import lombok.experimental.SuperBuilder;

import static com.artpro.utils.Support.conversionOfPowerTokW;

//класс гражданского траспорта с наследованием от воздушного
@Getter
@Setter
@SuperBuilder
public class CivilTransport extends AirTransport {
    //- Кол-во пассажиров
//- Наличие бизнес класса (true/false)
    private Integer numberOfPassengers; //кол-во пассажиров
    private boolean businessСlass; //бизнес класс

    //создали метод toString для получения представления нашего объекта в виде строки
    //поля добавляем из класса AirTransport + Transport: wingspan, minRunwayLength, power, maxSpeed, weight, brand
    //так же из собственного класса CivilTransport добавили: numberOfPassengers, businessСlass
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
                "numberOfPassengers" + getNumberOfPassengers() + "человек" +
                "businessСlass" + isBusinessСlass() +
                "} ";
    }
}
