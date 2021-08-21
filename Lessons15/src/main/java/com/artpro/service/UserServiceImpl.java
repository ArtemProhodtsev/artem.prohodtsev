package com.artpro.service;

import com.artpro.exceptions.NoSuchProductException;
import com.artpro.exceptions.ProductAlreadyExistsException;
import com.artpro.model.Product;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

import static com.artpro.input.ConsoleMenu.*;
import static com.artpro.input.UserConsoleInput.readLineFromConsole;
import static com.artpro.input.UserConsoleInput.readNumberFromConsole;
import static java.util.Collections.reverse;

public class UserServiceImpl implements UserService {
    private final ShopService shopService;

    public UserServiceImpl(ShopService shopService) {
        this.shopService = shopService;
    }

    @Override
    public void showMenu() {
        startingTheMenu();
    }

    @Override
    public void showContinueMenu() {
        startingContinueMenu();
    }

    private void startingContinueMenu() {
        continueMenu();
        int number = readNumberFromConsole("Введите число от 1 до 2", 2);
        switch (number) {
            case 1 -> startingTheMenu();
            case 2 -> shopService.closeShop();
        }
    }

    private void startingTheMenu() {
        showMainMenu();
        int number = readNumberFromConsole("Введите число от 1 до 5", 5);
        switch (number) {
            case 1 -> startMenuOfAllProducts();
            case 2 -> startMenuAddProduct();
            case 3 -> startRemoveMenu();
            case 4 -> startEditProductMenu();
            case 5 -> shopService.closeShop();
        }
    }

    private void startMenuOfAllProducts() {
        showMenuOfAllProducts();
        int number = readNumberFromConsole("Введите число от 1 до 4", 4);
        List<Product> productList = shopService.getAllProduct();
        switch (number) {
            case 1 -> printList(sortListByPriceByInc(productList), "по цене(возрастания)");
            case 2 -> printList(sortListByPriceByDec(productList), "по цене(убывания)");
            case 3 -> printList(reverseList(productList), "по добавлению(сначала новые, потом старые)");
            case 4 -> startingTheMenu();
        }
    }

    private void startMenuAddProduct() {
        showAddProductMenu();
        int number = readNumberFromConsole("Введите число от 1 или 2", 2);
        switch (number) {
            case 1 -> addProduct();
            case 2 -> startingTheMenu();
        }
    }

    private void startRemoveMenu() {
        showRemoveProductMenu();
        int number = readNumberFromConsole("Введите число от 1 или 2", 2);
        switch (number) {
            case 1 -> removeProduct();
            case 2 -> startingTheMenu();
        }
    }

    private void startEditProductMenu() {
        showEditingProductMenu();
        int number = readNumberFromConsole("Введите число от 1 или 2", 2);
        switch (number) {
            case 1 -> editingProduct();
            case 2 -> startingTheMenu();
        }
    }

    private List<Product> sortListByPriceByInc(List<Product> listOfProducts) {
        listOfProducts.sort(Comparator.comparingInt(Product::getPrice));
        return listOfProducts;
    }

    private List<Product> sortListByPriceByDec(List<Product> listOfProducts) {
        listOfProducts.sort((pr1, pr2) -> pr2.getPrice() - pr1.getPrice());
        return listOfProducts;
    }

    private List<Product> reverseList(List<Product> listOfProducts) {
        List<Product> reverseList = new ArrayList<>(listOfProducts);
        reverse(reverseList);
        return reverseList;
    }

    private void printList(List<Product> listOfProducts, String message) {
        System.out.printf("Список продуктов в магазине %s.\n", message);
        for (Product product : listOfProducts) {
            System.out.println(product);
        }
    }

    private void addProduct() {
        Product product = new Product();
        int userId = readNumberFromConsole("Задайте id", Integer.MAX_VALUE);
        try {
            if (shopService.getAllProduct().stream().allMatch(pr -> pr.getId() != userId)) {
                System.out.println("Введенный id подходит.");
                product.setId(userId);
            } else {
                throw new ProductAlreadyExistsException("Такой id уже существует.");
            }
            product.setName(readLineFromConsole());
            product.setPrice(readNumberFromConsole("Задайте цену товара", Integer.MAX_VALUE));
            shopService.addProduct(product);
            System.out.println("Товар добавлен!");
        } catch (ProductAlreadyExistsException e) {
            System.out.println(e.getMessage());
        }
    }

    private void removeProduct() {
        Product product = findProductById(readNumberFromConsole("Задайте id", Integer.MAX_VALUE));
        try {
            if (product != null) {
                shopService.getAllProduct().remove(product);
                System.out.println("Продукт удален!");
            } else {
                throw new NoSuchProductException("Продукта с таким id не найдено.");
            }
        } catch (NoSuchProductException e) {
            System.out.println(e.getMessage());
        }

    }

    private Product findProductById(int id) {
        for (Product product : shopService.getAllProduct()) {
            if (product.getId() == id) {
                return product;
            }
        }
        return null;
    }

    private void editingProduct() {
        Product product = findProductById(readNumberFromConsole("Задайте id", Integer.MAX_VALUE));
        try {
            if (product != null) {
                System.out.println("Продукт найден.\n" + product);
                String name = readLineFromConsole();
                int price = readNumberFromConsole("Задайте цену продукта", Integer.MAX_VALUE);
                product.setName(name);
                product.setPrice(price);
                System.out.println("Продукт изменен!");
            } else {
                throw new NoSuchProductException("Продукта с таким id не найдено.");
            }
        } catch (NoSuchProductException e) {
            System.out.println(e.getMessage());
        }
    }
}
