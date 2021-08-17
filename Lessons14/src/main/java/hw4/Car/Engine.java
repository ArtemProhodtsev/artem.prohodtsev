package hw4.Car;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;

import java.io.Serializable;

@Getter
@Setter
@AllArgsConstructor
@ToString
public class Engine implements Serializable {
    private String engineType;
    private transient int numberOfCylinders;
}
