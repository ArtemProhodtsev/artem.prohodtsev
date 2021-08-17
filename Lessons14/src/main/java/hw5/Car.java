package hw5;

import com.fasterxml.jackson.annotation.JsonAlias;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@JsonIgnoreProperties(ignoreUnknown = true)
public class Car {
    @JsonAlias({"brand_name"})
    private String brand;
    @JsonAlias({"max_speed"})
    private int maxSpeed;
    private int price;

    @Override
    public String toString() {
        return "Автомобиль " +
                "марки: " + brand + ". " +
                "Максимальная скорость:  " + maxSpeed + " км/ч. " +
                "Цена: " + price + " $.";
    }
}

