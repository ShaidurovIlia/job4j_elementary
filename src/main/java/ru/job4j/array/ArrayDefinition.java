package ru.job4j.array;

public class ArrayDefinition {
    public static void main(String[] args) {
        short[] ages = new short[10];
        String[] surnames = new String[100500];
        float[] prices = new float[40];
        String[] names = new String[5];
        names[0] = "Good ";
        names[1] = "evening ";
        names[2] = "at work, ";
        names[3] = "by the ";
        names[4] = "fireplace!";
        System.out.println("Размер массива равен: " + ages.length);
        System.out.println("Размер массива равен: " + surnames.length);
        System.out.println("Размер массива равен: " + prices.length);
        System.out.print(names[0]);
        System.out.print(names[1]);
        System.out.print(names[2]);
        System.out.print(names[3]);
        System.out.print(names[4]);
    }
}
