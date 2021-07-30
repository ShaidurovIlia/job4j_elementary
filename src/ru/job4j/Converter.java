package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70f;
    }

    public static float rubleToDollar(float value) {
        return value / 60f;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}