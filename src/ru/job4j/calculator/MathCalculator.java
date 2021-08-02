package ru.job4j.calculator;

public class MathCalculator {

    public static double sumAndMultiply(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second);
    }

    public static double minusAndSplit(double first, double second) {
        return ru.job4j.math.MathFunction.minus(first, second)
                + ru.job4j.math.MathFunction.split(first, second);
    }

    public static double sumAndMultiplyAndMinesAndSplit(double first, double second) {
        return ru.job4j.math.MathFunction.sum(first, second)
                + ru.job4j.math.MathFunction.multiply(first, second)
                + ru.job4j.math.MathFunction.minus(first, second)
                + ru.job4j.math.MathFunction.split(first, second);
    }

    public static void main(String[] args) {
        System.out.println("Результат расчета равен: " + sumAndMultiply(10, 20));
        System.out.println("Результат расчета равен:" + minusAndSplit(10, 20));
        System.out.println("Результат расчета равен:" + sumAndMultiplyAndMinesAndSplit(10, 20));
    }
}
