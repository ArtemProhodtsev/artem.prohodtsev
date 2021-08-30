//4) Создаем класс Car с полями number (номер авто) и year (год выпуска).
//     * List<Car> cars = Arrays.asList(
//     *             new Car("AA1111BX", 2007),
//     *             new Car("AK5555IT", 2010),
//     *             new Car(null, 2012),
//     *             new Car("", 2015),
//     *             new Car("AI3838PP", 2017));
//     *
//     * Необходимо вывести все не пустые номера машин, выпущенных после 2010 года

package Task4;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class T4 {
    public static void main(String[] args) {
        List<Car> cars = Arrays.asList(
                new Car("AA1111BX", 2007),
                new Car("AK5555IT", 2010),
                new Car(null, 2012),
                new Car("", 2015),
                new Car("AI3838PP", 2017));

        List<String> carNumbers = cars.stream()
                .filter(car -> car.getNumber() != null) //не пустые
                .filter(car -> car.getYear() > 2010) //после 2010
                .map(Car::getNumber)
                .collect(Collectors.toList());
        carNumbers.forEach(System.out::println);
    }
}