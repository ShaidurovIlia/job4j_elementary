package ru.job4j;

public class Converter {

    public static float rubleToEuro(float value) {
        return value / 70f;
    }

    public static float rubleToDollar(float value) {
        return value / 60f;
    }

    public static void main(String[] args) {
        float in = 140f;
        float expected = 2f;
        float out = Converter.rubleToEuro(in);
        boolean passed = expected == out;
        System.out.println("140 rubles are 2. Test result : " + passed);
        float an = 180f;
        float pending = 3f;
        float ou = Converter.rubleToDollar(an);
        boolean pass = pending == ou;
        System.out.println("180 rubles are 3. Test result : " + pass);
    }
}