package oop;

public class Calculator {
  //  Skapa en class Calculator som läser in två tal i 	konstruktorn och sparar dem som attribut


    // Attribut för två heltal
    int number1;
    int number2;

    // Konstruktor som tar emot två tal och sparar dem som attribut
    //används för att skapa ett nytt objekt av typen Calculator och
    // initialisera dess attribut number1 och number2 med de värden som skickas in som argument.
    public Calculator(int number1, int number2) {
        this.number1 = number1; //använder vi "this" för att referera till klassens attribut.
        this.number2 = number2;
    }

    // Metod för att skriva ut talen
    public void printNumbers() {
        System.out.println("Första talet är: " + number1);
        System.out.println("Andra talet är : " + number2);
    }


    public static void main(String[] args) {
        // Skapa ett Calculator-objekt med två tal
        Calculator calc = new Calculator(5, 10);

        // Anropa metoden för att skriva ut talen som skickades in i konstruktorn.
        calc.printNumbers(); // Förväntad output: "Första talet är: 5" och "Andra talet är: 10"
    }


}














