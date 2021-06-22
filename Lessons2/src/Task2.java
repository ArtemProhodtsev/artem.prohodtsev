public class Task2 {
    public static void main(String[] args) {
        int s = summa(10, -90);
        System.out.println("По условию задачи 1 метод summa() нам вернул:" + " " + s);

        int m = max(10, 40);
        System.out.println("По условию задачи 2 метод max() нам вернул:" + " " + m);

        double ave = average(new int[]{0, -2, 3, -1, 5});
        System.out.println("Cреднее значение по задаче 3 из массива чисел:" + " " + ave);

        int maxArray = arrmax(new int[]{10, 45, 3, 10, 5});
        System.out.println("Максимальный элемент по задаче 4 из массива чисел:" + " " + maxArray);

        double hyp = calculateHypotenuse(12,15);
        String formattedHyp = String.format("%.2f", hyp);
        System.out.println("Значение гиппотенузы по задаче 5:" +" "+formattedHyp);
    }

    /**
     * 1. Метод должен вернуть сумму двух чисел a и b
     * 2. Дополнительно: сделать проверку если сумма a и b больше чем максимальное значение int то вернуть -1
     **/
    public static int summa(int a, int b) {
        int summaAB = a + b;
        int maxAB = Math.max(a, b);
        if (summaAB > maxAB) {
            return (-1); //
        } else {
            return summaAB;
        }
    }

    /**
     * Метод должен вернуть максимальное значение из двух чисел
     **/
    public static int max(int a, int b) {
        int maxAB = Math.max(a, b);
        return (maxAB);
    }

    /**
     * Метод должен вернуть среднее значение из массива чисел
     **/
    public static double average(int[] array) {
        double sum = 0;
        double count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] < 0) {
                sum += array[i];
                count++;
            }
        }
        return sum/count;
    }
    /**
     * Метод должен вернуть максимальый элемент массива.
     **/
    public static int arrmax(int[] array) {

        int maxArr = array[0];
        for (int i = 1; i < array.length; i++)
            maxArr = Math.max(maxArr, array[i]);
        return maxArr;
    }

    /**
     * Используя теорему Пифагора, вычислите значение гипотенузы. Квадрат гипотенузы = сумме квадратов катетов
     **/
    public static double calculateHypotenuse(double katet1, double katet2) {
        double hypothenuse = Math.sqrt((katet1 * katet1) + (katet2 * katet2));
        return hypothenuse;
    }
}


