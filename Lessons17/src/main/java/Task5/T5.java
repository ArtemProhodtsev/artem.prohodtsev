//5) Задан список сотрудников, которые хранятся в коллекции List<Person>.
//        * Объект Person содержит имя и фамилию(по желанию другие данные)
//        *  a) написать метод, который отображает все фамилии, начинающиеся на букву "Д".
//        *     Внимание! метод должен вернуть объект Optional<String>.
//        *  b*)Со звездочкой. Написать метод, который будет выводить в столбик первую букву фамилии и рядом количество сотрудников,
//        *  у которых фамилия начинается с этой буквы.
//        *  Пример: Антонов, Петров, Сидоров, Александров...
//        *  на экран выведет:
//        *  A - 2 сотрудника
//        *  П - 1 сотрудник
//        *  С - 1 сотрудник
package Task5;

import java.util.List;
import java.util.Map;
import java.util.Objects;
import java.util.Optional;
import java.util.stream.Collectors;

public class T5 {
    public static void main(String[] args) {

        List<Person> people = List.of(
                new Person("Иванов", "Иван", 18),
                new Person("Кузьмич", "Валерий", 26),
                new Person("Додик", "Слава", 50),
                new Person("Дикий", "Джо", 21),
                new Person("Алтын", "Олег", 78),
                new Person("Бобёр", "Анексий", 8));

        Optional<String> result = getSurnameByLetter(people, "Д");
        result.ifPresentOrElse(System.out::println, () -> System.out.println("Не найдено"));

        Map<String, Long> countSurname = getPersonByFirstLetter(people);
        for (Map.Entry<String, Long> entry : countSurname.entrySet()) {
            System.out.println(entry.getKey() + " - " + entry.getValue());
        }
    }

    private static Optional<String> getSurnameByLetter(List<Person> personList, String letter) {
        return Optional.of(personList.stream()
                .filter(Objects::nonNull)
                .map(Person::getSurname)
                .filter(name -> name.startsWith(letter))
                .collect(Collectors.joining(", ")));
    }

    //*
    private static Map<String, Long> getPersonByFirstLetter(List<Person> personList) {
        return personList.stream()
                .map(Person::getSurname)
                .map(name -> name.substring(0, 1))
                .collect(Collectors.groupingBy(let -> let, Collectors.counting()));
    }
}
