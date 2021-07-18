package com.artpro.utils;

//класс подержки для проведения всяких расчётов
//так как данный класс является хелпером, то финализируем его (public final)
public final class Support {
    //так как данный класс является хелпером, то делаем его конструктор приватным по умолачиню
    private Support() {
    }

    //добавил метод перевода лошадиных силы в кВ
    public static double conversionOfPowerTokW(double horsepower) {
        return horsepower * 0.74;
    }
}
