package com.artpro.utils;

//класс подержки для проведения всяких расчётов
public class Support {
    //довил морый ппревод лошадиные силы в кВ
    public static double conversionOfPowerTokW(int horsepower) {
        return horsepower * 0.74;
    }
}
