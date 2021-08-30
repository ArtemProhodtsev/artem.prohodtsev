//2) Определение количества четных чисел в потоке данных.
//        * Создаем коллекцию Set<Integer> в которую добавляем рандомно 50 чисел от 0 до 100
package Task2;

import java.util.Random;
import java.util.Set;
import java.util.stream.Collectors;

public class T2 {
    public static void main(String[] args) {
        Random random = new Random();

        Set<Integer> integers = random.ints(50, 0, 100)
                .boxed()
                .collect(Collectors.toSet());
        System.out.println(integers);

        long count = integers.stream()
                .filter(num -> num % 2 == 0)
                .count();
        System.out.println("Количество четных чисел в списке: " + count);
    }
}