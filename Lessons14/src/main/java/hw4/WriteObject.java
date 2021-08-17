package hw4;

import hw4.Car.Car;
import hw4.Car.Engine;
import hw4.Car.FuelTank;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;

public class WriteObject {
    public static void main(String[] args) {
        Car[] cars = {new Car("Brand1", 100, 123, new Engine("Дизельный", 6), new FuelTank("Дизельное", 40)),
                new Car("Brand2", 200, 321, new Engine("Бензиновый", 8), new FuelTank("АИ-92", 50))};

        try (ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("Lessons14/src/main/java/hw4/Car.data"))) {
            oos.writeObject(cars);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
