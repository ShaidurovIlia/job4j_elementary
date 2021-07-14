package ru.job4j.calculate;

public class calculator {
    public static void plus(int first, int second){
        int result=first+second;
        System.out.println(result);
    }
    public static void main(String[]args){
        calculator.plus(100,500);
        calculator.plus(4,2);
        calculator.plus(3,5);
    }
}
