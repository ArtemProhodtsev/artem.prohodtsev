package com.artpro.task1.model;

import com.artpro.task1.exceptions.CarExc;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.util.Random;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Car {
    //Создать класс Car c полями (марка, скорость, цена), конструкторы (с параметрами и default) гетеры-сетеры.
    private String model;
    private int speed;
    private int price;

    public Car(String model) {
        this.model = model;
    }

    public void start() throws CarExc {
        Random random = new Random();
//        В методе старт генерируете случайное число от 0 до 20, если полученное число оказалось четным,
//        то выбрасываете созданное ранее вами исключение и передаете его к месту откуда вызывали метод старт.
//        Если все хорошо и исключение не вылетело, то выводить в консоль сообщение что автомобиль с такой-то маркой завелся.
        int number = random.nextInt(21);
        System.out.println(number);
        if (number % 2 == 0) { //если чётное
            throw new CarExc("Автомобиль марки " + getModel() + " не завёлся");
        } else {
            System.out.println("Автомобиль марки " + getModel() + " завёлся");
        }
    }
}


