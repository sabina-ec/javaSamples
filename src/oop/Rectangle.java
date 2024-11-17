package oop;

public class Rectangle {
    // attribut
    private int high, width;


    //konstruktor med 2 inparametrar av typen int
    public Rectangle(int inputHigh, int inputWidth) {

        high = inputHigh;
        width = inputWidth;
    }


    // metod för att rekna ut arean
    public int calculateArea() {
        return high * width;
    }


    //Metod för att räkna ut omkretsen

    public int calculatePerimeter() {
        return high * 2 + width * 2;

    }

}
