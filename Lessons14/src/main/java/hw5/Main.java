package hw5;

import com.fasterxml.jackson.databind.ObjectMapper;

import java.io.FileInputStream;
import java.io.IOException;

public class Main {
    public static void main(String[] args) {
        ObjectMapper objectMapper = new ObjectMapper();

        try (FileInputStream fileInputStream = new FileInputStream("Lessons14/src/main/java/hw5/car.json")) {
            Car car = objectMapper.readValue(fileInputStream, Car.class);
            System.out.println(car);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
