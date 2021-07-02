package com.home.service;

import com.home.model.Computer;

import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("AMD", "SSD", 16, 4);
        //создали новый массив computers размером = 1
        Computer[] computers = new Computer[1];
        //положили в массив наш объект comp
        computers[0] = comp;

        //вывод методов (инфа, включение, выключение)
        System.out.println(Arrays.toString(computers));
        comp.on();
        comp.off();

        System.out.println(Arrays.toString(computers));
        comp.on();
        comp.off();

        System.out.println(Arrays.toString(computers));
        comp.on();
        comp.off();

        System.out.println(Arrays.toString(computers));
        comp.on();
        comp.off();

    }
}