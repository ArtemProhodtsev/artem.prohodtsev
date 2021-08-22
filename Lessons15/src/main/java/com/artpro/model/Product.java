package com.artpro.model;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
public class Product {
    private int id;
    private String name;
    private int price;

    @Override
    public String toString() {
        return "Продукт: id: " + id +
                ". Название: " + name +
                ". Цена: " + price + " бел.руб.";
    }
}