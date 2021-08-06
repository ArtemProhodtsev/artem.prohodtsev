/**
 * 1) Вырезать подстроку из строки начиная с первого вхождения символа(А) до, последнего вхождения сивола(B).
 * 2) Заменить все вхождения символа стоящего в позиции (3) на символ стоящий в позиции 0
 * 3) В массиве находятся слова. Вывести на экран слова палиндромы (т.е которые читаются справа на лево и слева на право одинаково, например: заказ, казак, дед...)
 * 4) Есть строка в которой содержится текст, предложения разделены точками. После запуска программы на экран должны выводиться только те предложения в которых от 3-х до 5-ти слов.
 * Если в предложении присутствует слово-палиндром, то не имеет значения какое количество слов в предложении, оно выводится на экран.
 * Пишем все в ООП стиле. Создаем класс TextFormatter
 * в котором два статических метода:
 * 1. Метод принимает строку и возвращает кол-во слов в строке.
 * 2. Метод принимает строку и проверяет есть ли в строке слово-палиндром. Если есть возвращает true, если нет false
 * В main создаем строку с текстом, также можно текст задавать с консоли.
 * Разбиваем текст на предложения. Используя методы класса TextFormatter определяем подходит ли нам предложение.
 * Если подходит, то выводим на экран.
 */

import com.artpro.service.Text;
import com.artpro.service.TextImpl;

import static org.apache.commons.lang3.StringUtils.reverse;

public class Main {
    private static Text textFormatter = new TextImpl();

    public static void main(String[] args) {
        System.out.println(task1("мАрка, Варка"));
        System.out.println(task2("ночь"));
        task3("ночь, заказ, казак, дед");
        task4("Люди не летают как птицы потому что отростили большие ягодицы." + "Мноооооого букоооооов." + "оаоаоаоао блум.");
    }

    private static String task1(String text) {
        int firstIndex = text.indexOf('А');
        int secondIndex = text.lastIndexOf('В');
        return text.substring(firstIndex, secondIndex);
    }

    private static String task2(String text) {
        return text.replace(text.charAt(3), text.charAt(0));
    }

    private static void task3(String text) {
        String[] words = ((TextImpl) textFormatter).Split(text);
        for (String word : words) {
            if (word.equals(reverse(word)) && word.length() > 1) {
                System.out.println(word);
            }
        }
    }

    private static void task4(String text) {
        String[] sentences = text.split("\\.");
        for (String sentence : sentences) {
            int count = textFormatter.Count(sentence);
            if ((count >= 3 && count <= 5) || textFormatter.Palindrome(sentence)) {
                System.out.println(sentence);
            }
        }
    }
}
