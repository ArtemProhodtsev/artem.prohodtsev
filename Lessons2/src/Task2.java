import java.util.ArrayList;
import java.util.Scanner;

public class test {
    public static void main(String[] args) {
        int s = summa();
        System.out.println("По условию задачи 1 метод summa() нам вернул:" + " " + s);
        int m = max();
        System.out.println("По условию задачи 2 метод max() нам вернул:" + " " + m);
        double ave = average();
        System.out.println("Cреднее значение по задаче 3 из массива чисел:" + " " + ave);
        int maxArray = arrmax();
        System.out.println("Максимальный элемент по задаче 4 из массива чисел:" + " " + maxArray);
        double hyp = calculateHypotenuse();
        String formattedHyp = String.format("%.2f", hyp);
        System.out.println("Значение гиппотенузы по задаче 5:" +" "+formattedHyp);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int summa() {
        System.out.println("<=========Задача 1 из 5 (сумму двух чисел с условием)=========>");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите число а:");
        int a = keyboard.nextInt();
        System.out.print("Введите число b:");
        int b = keyboard.nextInt();
        int summaAB = a + b;
        int maxAB = Math.max(a, b);
        if (summaAB > maxAB) {
            return (-1); //
        } else {
            return (summaAB);
        }
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     **/
    public static int max() {
        System.out.println("<=========Задача 2 из 5 (максимальное значение)=========>");
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Введите число а:");
        int a = keyboard.nextInt();
        System.out.print("Введите число b:");
        int b = keyboard.nextInt();
        int maxAB = Math.max(a, b);
        return (maxAB);
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     **/
    public static double average() {
        System.out.println("<=========Задача 3 из 5 (среднее значение)=========>");
        System.out.print("Введите с консоли через пробел числа:");
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String s = keyboard.nextLine();
        keyboard = new Scanner(s);
        while (keyboard.hasNextInt()) {
            arr.add(keyboard.nextInt());
        }
        double average = 0;
        if (arr.size() > 0) {
            double sumArray = 0;
            for (int i = 0; i < arr.size(); i++) {
                sumArray += arr.get(i);
            }
            average = sumArray / arr.size();
        }
        return (average);
    }

    /**
     * Метод должен вернуть максимальый элемент массива.
     **/
    public static int arrmax() {
        System.out.println("<=========Задача 4 из 5 (максимальный элемент массива)=========>");
        System.out.print("Введите с консоли через пробел числа:");
        Scanner keyboard = new Scanner(System.in);
        ArrayList<Integer> arr = new ArrayList<>();
        String s = keyboard.nextLine();
        keyboard = new Scanner(s);
        while (keyboard.hasNextInt()) {
            arr.add(keyboard.nextInt());
        }
        int maxArr = arr.get(0);
        for (int i = 1; i < arr.size(); i++)
            maxArr = Math.max(maxArr, arr.get(i));
        return (maxArr);
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     **/
    public static double calculateHypotenuse() {
        System.out.println("<=========Задача 5 из 5 (значение гипотенузы)=========>");
        System.out.print("Введите значение для первого катета:");
        Scanner keyboard = new Scanner(System.in);
        double katet1 = keyboard.nextInt();
        System.out.print("Введите значение для второго катета:");
        double katet2 = keyboard.nextInt();
        double hypothenuse = Math.sqrt((katet1 * katet1) + (katet2 * katet2));
        return (hypothenuse);

    }
}


