package com.home.service;

import com.home.model.Computer;

public class Main {
    public static void main(String[] args) {
        Computer comp = new Computer("AMD", "SSD", 16, 4);

        comp.info();
        comp.on();
        comp.off();

        comp.info();
        comp.on();
        comp.off();

        comp.info();
        comp.on();
        comp.off();

        comp.info();
        comp.on();
        comp.off();

    }
}