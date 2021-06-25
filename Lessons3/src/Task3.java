import java.util.Random;
import java.util.Scanner;

public class Task3 {
    public static void main(String[] args) {
        int odd = average(new int[]{0, -2, 3, -1, 5, 10});
        System.out.println("Задача 3: Колличество нечетных элементов в массиве : " + odd);

        int number = operation(0);
        System.out.println("Задача 2: Номер в зависимости от условия: " + number);

        System.out.println("Задача 3: Склонение в зависимости от числа");
        countDevs(2);
        System.out.println();
        /**
         * Необходимо прочитать с консоли значение числа типа int,
         * далее создать одноменрый массив типа int размера прочитаного с консоли
         * далее заполнить массив случайными значениями
         * далее вывести массив на консоль
         */
        Scanner scanner = new Scanner(System.in);
        System.out.print("Введите размер массива по задаче 1:");
        int size = scanner.nextInt();
        int[] myArray = new int[size];
        Random random = new Random();
        for (int i = 0; i < myArray.length; i++)
            myArray[i] = random.nextInt();
        System.out.print("\nЗадача 1: Вывод элементов массива myArray: ");
        for (int i = 0; i < myArray.length; i++)
            System.out.print(myArray[i] + ", ");

    }

    /**
     * Метод должен выполнять некоторую операцию с int "number" в зависимости от некоторых условий:
     * - if number положительное число, то необходимо number увеличить на 1
     * - if number отрицательное - уменьшить на 2
     * - if number равно 0 , то замените значение number на 10
     * вернуть number после выполнения операций
     */

    private static int operation(int number) {
        if (number > 0) number = number + 1;
        else if (number < 0) number = number + 1;
        else number = 10;
        return number;
    }

    /**
     * На вход приходит массив целых чисел типа int
     * Необходимо найти количество нечетных элементов в массиве и вернуть значение в метод main,
     * в котором это значение распечатается на консоль.
     */
    private static int average(int[] array) {
        int odd = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 != 0) {
                odd++;
            }
        }
        return odd;
    }

    /**
     * На вход приходит число.
     * Вывести в консоль фразу из разряда "_COUNT_ программистов",
     * заменить _COUNT_ на число которое пришло на вход в метод и заменить окончание в слове "программистов" на
     * уместное с точки зрения русского языка.
     * Пример: 1 программист, 42 программиста, 50 программистов
     */
    public static void countDevs(int count) {
        System.out.print("Введите любое целове число: ");
        Scanner scanner = new Scanner(System.in);
        count = scanner.nextInt();
        String word = "";
        if (count % 10 == 1) {
            word = "Программист";
        }
        if ((count % 10 >= 1) && (count % 10 <= 4)) {
            word = "Программистa";
        }
        if ((count % 10 == 0) || (count % 10 >= 5) && (count % 10 <= 9)) {
            word = "Программистов";
        }
        System.out.printf("%d %s", count, word);

    }
}


