package com.artpro.input;

import java.util.Scanner;

public class UserConsoleInput {

    public static int readNumberFromConsole(String message, int numberFit) {
        Scanner scanner = new Scanner(System.in);
        int number;
        do {
            System.out.println(message + ":");
            while (!scanner.hasNextInt()) {
                System.out.println("Это не число");
                scanner.next();
            }
            number = scanner.nextInt();
        } while (isNumberNotFit(number, numberFit));
        return number;
    }

    private static boolean isNumberNotFit(int number, int numberFit) {
        if (number < 1 || number > numberFit) {
            System.out.println("Число не соответствует допустимому.");
        }
        return number < 1 || number > numberFit;
    }

    public static String readLineFromConsole() {
        Scanner scanner = new Scanner(System.in);
        String userProduct;
        do {
            System.out.println("Введите корректное имя товара.");
            while (!scanner.hasNextLine()) {
                System.out.println("Это не может быть именем");
                scanner.next();
            }
            userProduct = scanner.nextLine();
        } while (!userProduct.matches("[A-z\\-А-яё\\s]+")); //Для русских и англ. букв
        return userProduct;
    }
}