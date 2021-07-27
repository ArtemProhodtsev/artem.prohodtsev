package com.artpro.legs;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class SonyLeg implements ILeg {
    private final int price;

    @Override
    public void step() {
        System.out.println("Сделала шаг нога Toshiba");
    }

    @Override
    public int getPrice() {
        return this.price;
    }
}
