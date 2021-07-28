package ru.job4j.calculate;
public class Сalculator {
    public static void plus(int first, int second){
        int result=first+second;
        System.out.println(result);
    }
    public static void main(String[]args){
        Сalculator.plus(100,500);
        Сalculator.plus(4,2);
        Сalculator.plus(3,5);
    }
}