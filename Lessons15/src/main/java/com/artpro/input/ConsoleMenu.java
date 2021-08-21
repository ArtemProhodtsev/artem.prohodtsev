package com.artpro.input;

public class ConsoleMenu {

    public static final String ANSI_GREEN = "\u001B[32m";

    public static void showMainMenu() {
        System.out.println(ANSI_GREEN + "Интернет магазин продуктов рад приветствовать вас!");
        System.out.println();
        System.out.println("Чего изволите?");
        System.out.println("1 - Покажи мне все продукты.");
        System.out.println("2 - Хочу добавить продукт.");
        System.out.println("3 - Хочу удалить продукт.");
        System.out.println("4 - Хочу изменить продукт.");
        System.out.println("5 - Выйти.");
    }

    public static void showMenuOfAllProducts() {
        System.out.println("Показать продукты в зависимости от следующих параметров:");
        System.out.println("1 - по цене(возрастание)");
        System.out.println("2 - по цене(убывание)");
        System.out.println("3 - по добавлению(сначала новые, потом старые)");
        System.out.println("4 - Вернуться в главное меню.");
    }

    public static void showAddProductMenu() {
        System.out.println("1 - Введите параметры нового продукта: Id, наименование, цена.");
        System.out.println("2 - Вернуться в главное меню.");
    }

    public static void showRemoveProductMenu() {
        System.out.println("1 - Введите id продукта, который надо удалить.");
        System.out.println("2 - Вернуться в главное меню.");
    }

    public static void showEditingProductMenu() {
        System.out.println("1 - Введите id продукта который надо изменить.");
        System.out.println("2 - Вернуться в главное меню.");
    }

    public static void continueMenu() {
        System.out.println();
        System.out.println("Для продолжения выберите один из следующих пунктов:");
        System.out.println("1 - Выйти в главное меню.");
        System.out.println("2 - Выход из магазина.");
    }
}