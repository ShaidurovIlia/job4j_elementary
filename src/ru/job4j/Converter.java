package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        return 70f / value;
    }

    public static float rubleToDollar(float value) {
        return 60f / value;
    }

    public static void main(String[] args) {
        float euro = Converter.rubleToEuro(140);
        System.out.println("140 rubles are " + euro + " euro.");
        float dollar = Converter.rubleToDollar(180);
        System.out.println("180 rubles are " + dollar + " dollar.");
    }
}