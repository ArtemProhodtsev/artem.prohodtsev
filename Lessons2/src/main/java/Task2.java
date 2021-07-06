import java.util.stream.IntStream;

public class Task2 {
    public static void main(String[] args) {
        long s = summa(10, -90);
        System.out.println("По условию задачи 1 метод summa() нам вернул: " + s);

        int m = max(10, 40);
        System.out.println("По условию задачи 2 метод max() нам вернул: " + m);

        double ave = average(new int[]{0, -2, 3, -1, 5});
        System.out.println("Среднее значение по задаче 3 из массива чисел: " + ave);
        System.out.println(getMax(new int[]{}));

        int maxArray = getMax(new int[]{10, 45, 3, 10, 5});
        System.out.println("Максимальный элемент по задаче 4 из массива чисел: " + maxArray);

        double hyp = calculateHypotenuse(12, 15);
        String formattedHyp = String.format("%.2f", hyp);
        System.out.println("Значение гиппотенузы по задаче 5: " + formattedHyp);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int summa(int a, int b) {
        long summaAB = a + (long) b;
        if (summaAB > Integer.MAX_VALUE) {
            return -1; //
        } else {
            return (int) summaAB;
        }
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     **/
    public static int max(int a, int b) {
        return Math.max(a, b);
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     **/
    public static double average(int[] array) {
        int sum = IntStream.of(array).sum();
        double count = array.length;
        return sum / count;
    }

    /**
     * Метод должен вернуть максимальый элемент массива.
     **/
    public static int getMax(int[] inputArray) {
        if (inputArray.length != 0) {
            int maxValue = inputArray[0];
            for (int i = 1; i < inputArray.length; i++) {
                if (inputArray[i] > maxValue) {
                    maxValue = inputArray[i];
                }
            }
            return maxValue;
        } else {
            return 0;
        }
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     **/

    public static double calculateHypotenuse(double katet1, double katet2) {
        return Math.sqrt((katet1 * katet1) + (katet2 * katet2));
    }
}





