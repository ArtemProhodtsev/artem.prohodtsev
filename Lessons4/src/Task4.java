import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Task4 {
    public static void main(String[] args) {
        //Задача 2
        System.out.println(summa(2, 9));
        System.out.println(summa1(2, 9));
        //Задача 4
        System.out.println(" ,колличество цифр = " + getCountsOfDigits(23459));
        //Задача 1
        progressionA(1);
        //Задача 5
        inLine();
        //Задача 6
        maxIndex();
        //Задача 7
        massZero();
        //Задача 8
        for (int i : findMaxElementAndReplace(new int[]{4, 5, 0, 23, 77, 0, 8, 9, 101, 2}))
            System.out.print(i + " ");
        System.out.println(" ");
        //Задача 9
        massDifference();
        //Задача 10
        matrixTransp();
        //Задача 3
        paintMatrix();
    }


    //        Задачи:
//         1) Одноклеточная амеба каждые 3 часа делится на 2 клетки. Определить,
//   сколько амеб будет через 3, 6, 9, 12,..., 24 часа
    private static void progressionA(int ameba) {
        System.out.println("Решение задачи 1");
        for (int i = 0; i < 24; i += 3) {
            ameba = ameba * 2;
            System.out.println(ameba);
        }
    }

    //        2) Напишите реализацию метода summ(int a, int b), вычисляющий a*b, не пользуясь операцией
//        умножения, где a и b целые числа, вызовите метод summ  в методе main и распечатайте на консоль.
    public static double summa(int a, int b) {
        System.out.println("Решение задачи 2");
        return Math.pow(10, (Math.log10(a) + Math.log10(b)));
    }

    public static double summa1(double a, double b) {
        System.out.println("Решение задачи 2");
        return 0 == b ? 0 : a / (1 / b);
    }

//        3) Дан двухмерный массив размерностью 4 на 4, необходимо нарисовать четыре треугольника вида

    //        a)                  b)
//              *        *
//            * *        * *
//          * * *        * * *
//        * * * *        * * * *
//
//        c)                  d)
//        * * * *        * * * *
//          * * *        * * *
//            * *        * *
//              *        *
    public static void paintMatrix() {
        System.out.print("Введите размер матрицы: ");
        Scanner key = new Scanner(System.in);
        int n = key.nextInt();
        for (int i = 0; i <= n; i++) {
            for (int j = 0; j < n - i; j++) {
                System.out.print("  ");
            }
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
        for (int i = 0; i <= n; i++) {
            for (int j = i; j > 0; j--) {
                System.out.print("* ");
            }
            System.out.println();
        }
    }

    //        4)В переменную записываем число.
//        Надо вывести на экран сколько в этом числе цифр и положительное оно или отрицательное.
//        Например, Введите число: 5
//        "5 - это положительное число, количество цифр = 1"
    public static int getCountsOfDigits(long number) {
        System.out.println("Решение задачи 4");
        if (number == 0) {
            System.out.print(number + " - ноль");
        } else if (number > 0) {
            System.out.print(number + " - это положительное число");
        } else {
            System.out.print(number + " - это отрицательное число");
        }
        return String.valueOf(Math.abs(number)).length();
    }
//    public static int getCountsOfDigits(long number) {
//        int count = (number == 0) ? 1 : 0;
//        while (number != 0) {
//            count++;
//            number /= 10;
//        }
//        return count;
//    }

    //        5) Создайте массив из всех нечётных чисел от 1 до 100, выведите его на экран в строку,
//        а затем этот же массив выведите на экран тоже в строку, но в обратном порядке (99 97 95 93 ... 7 5 3 1).
    public static void inLine() {
        System.out.println("Решение задачи 5");
        int[] mas = new int[50];
        for (int i = 0, n = 1; i < mas.length; n = n + 2, i++) {
            mas[i] = n;
            System.out.print(mas[i] + " ");
        }
        System.out.println();
        for (int i = mas.length - 1; i >= 0; i--) {
            System.out.print(mas[i] + " ");
        }
        System.out.println();
    }

    //        6) Создайте массив из int[] mass = new int[12]; Рандомно заполните его значениями от 0 до 15.
//        Определите какой элемент является в этом массиве максимальным и сообщите индекс его последнего вхождения в массив.
//        Пример: {3,4,5,62,7,8,4,-5,7,62,5,1} Максимальный элемент 62, индекс его последнего вхождения в массив = 10
    public static void maxIndex() {
        System.out.println("Решение задачи 6");
        int[] mass = new int[12];
        int max = 0, j = 0;
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 15);
            System.out.print(mass[i] + " ");
        }
        for (int i = 0; i < mass.length; i++) {
            if (mass[i] >= max) {
                max = mass[i];
                j = i;
            }
        }
        System.out.println("");
        System.out.println("Максимальный элемент " + mass[j] + " ,индекс его последнего вхождения в массив= " + j);
    }


    //        7) Создайте массив размера 20, заполните его случайными целыми чиселами из отрезка от 0 до 20.
//        Выведите массив на экран в строку. Замените каждый элемент с нечётным индексом на ноль.
//        Снова выведете массив на экран на отдельной строке.
    public static void massZero() {
        System.out.println("Решение задачи 7");
        int[] mass = new int[8];
        for (int i = 0; i < mass.length; i++) {
            mass[i] = (int) (0 + Math.random() * 20);
        }
        for (int i = 0; i < mass.length; i++) {
            System.out.print(mass[i] + " ");
        }
        System.out.println();
        for (int i = 0; i < mass.length; i++) {
            if (i % 2 == 0) {
                mass[i] = 0;
            }
            System.out.print(mass[i] + " ");
        }
        System.out.println(" ");
    }

    //        8) Найти максимальный элемент в массиве {4,5,0,23,77,0,8,9,101,2} и поменять его местами с нулевым элементом

    public static int[] findMaxElementAndReplace(int[] array) {
        System.out.println("Решение задачи 8");
        int replaseIndex = 0, maxIndex = 0;
        for (int i = 1; i < array.length; ++i) {
            if (array[i] > array[maxIndex])
                maxIndex = i;
        }
        int t;
        if (maxIndex != replaseIndex) {
            t = array[replaseIndex];
            array[replaseIndex] = array[maxIndex];
            array[maxIndex] = t;
        }
        return array;
    }


    //        9) Проверить, различны ли все элементы массива, если не различны то вывести элемент повторяющийся
//        Пример: {0,3,46,3,2,1,2}
//        Массив имеет повторяющиеся элементы 3, 2
//        Пример: {0,34,46,31,20,1,28}
//        Массив не имеет повторяющихся элементов
    public static void massDifference() {
        System.out.println("Решение задачи 9");
        int[] arr1 = {123, 2, 12, 4, 3, 6, 8, 5, 8};
        int[] arr2 = {356, 5, 7, 1, 3, 8, 2, 2, 9, 10, 12};
        // объединили два массива в один
        int[] arr3 = Stream.of(arr1, arr2)
                // выкидываем distinct() из каждого массива поворяющиеся элементы и объединяем в один Stream<Integer>
                // flatMap() используют для объединения или объединения нескольких потоков в один поток.
                .flatMap(arr -> Arrays.stream(arr).distinct().boxed())
                // группируем в карту по количеству вхождений
                .collect(Collectors.groupingBy(i -> i, Collectors.counting()))
                // обходим карту
                .entrySet().stream()
                // количество больше одного
                .filter(e -> e.getValue() > 1)
                // получаем сами элементы
                .map(e -> e.getKey())
                // получаем 'int' значения элементов
                .mapToInt(Integer::intValue)
                // собираем в массив
                .toArray();
        // выводим массив повторяющихся элементов
        System.out.println(Arrays.toString(arr3));
    }


    //        10) Создаём квадратную матрицу, размер вводим с клавиатуры.
//        Заполняем случайными числами в диапазоне от 0 до 50. И выводим на консоль(в виде матрицы).
//        Далее необходимо транспонировать матрицу(1 столбец станет 1-й строкой, 2-й столбец - 2-й строкой и т. д.)
//        Пример:
//          1 2 3 4      1 6 3 1
//          6 7 8 9      2 7 3 5
//          3 3 4 5      3 8 4 6
//          1 5 6 7      4 9 5 7
    public static void matrixTransp() {
        System.out.println("Решение задачи 10");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите  размер стороны квадрата матрицы: ");
        int size = keyboard.nextInt();
        int[][] matrix = new int[size][size];
        Random random = new Random();
        //заполним матрицу рандомными значениями
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++) {
                matrix[i][j] = (int) (0 + Math.random() * 50);
            }
        }
        //выведем матрицу в консоль
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix[i].length; j++)
                System.out.print(matrix[i][j] + " ");
            System.out.println();
        }
        //магия транспонирования
        for (int i = 0; i < matrix.length; i++) {
            for (int j = i + 1; j < matrix.length; j++) {
                int temp = matrix[i][j];
                matrix[i][j] = matrix[j][i];
                matrix[j][i] = temp;
            }
        }
        //выводим транспонированную матрицу
        System.out.println();
        System.out.println("Транспонированная матрица:");
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                System.out.printf("%5d", matrix[i][j]);
            }
            System.out.println();
        }
    }
}


