package com.artpro.heads;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SonyHead implements IHead {
    private int price;

    @Override
    public void speek() {
        System.out.println("Говорит голова Sony");
    }

    @Override
    public int getPrice() {
        return price;
    }
}
