package hw4;

import hw4.Car.Car;

import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;

public class ReadObject {
    public static void main(String[] args) {
        try (ObjectInputStream ois = new ObjectInputStream(new FileInputStream("Lessons14/src/main/java/hw4/Car.data"))) {
            Car[] cars = (Car[]) ois.readObject();
            for (Car car : cars) {
                System.out.println(car);
            }
        } catch (IOException | ClassNotFoundException e) {
            e.printStackTrace();
        }
    }
}
