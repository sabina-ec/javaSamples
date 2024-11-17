package oop;

public class Circle {
    private double radien;
    private final double pi = 3.14;

    // konstruktor
    public Circle(double radien) {
        this.radien = radien;
    }

    // // Setter för radien
    public void setRadien(double radien) {
        this.radien = radien;
    }

    // Getter för radien
    public double getRadien() {
        return radien;
    }

    // metod för att rekna ut arean
    public double calculateArea() {
        return radien * radien * pi;
    }

    //Metod för att räkna ut omkretsen
    public double caculateCircumFerence() {
        return 2 * pi * radien;
    }

    // Metod för att jämföra två cirklar och se om den nuvarande är större
    public boolean isBiggerThan(Circle circle2) {
        return this.calculateArea() > circle2.calculateArea();
    }


}
