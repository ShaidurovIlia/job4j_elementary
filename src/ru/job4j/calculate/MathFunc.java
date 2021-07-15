package ru.job4j.calculate;

public class MathFunc {

    public static int func3(int x) {
        int y = x * x + 1;
        return y;
    }

    public static void main(String[] args) {
        int result = MathFunc.func3(100);
        System.out.println(result);
    }
}