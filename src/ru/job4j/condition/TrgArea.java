package ru.job4j.condition;

public class TrgArea {
    public static double area(double a, double b, double c) {
    double p=(a+b+c)/2;
    double one=p-a;
    double two=p-b;
    double three=p-c;
    return Math.sqrt(p*one*two*three);}
    public static void main(String[] args) {
        double rsl = TrgArea.area(2, 2, 2);
        System.out.println("area (2, 2, 2) = " + rsl);
}
}
