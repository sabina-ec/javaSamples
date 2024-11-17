package exerciseStaticMetod;

import java.util.Scanner;

public class Kalkylator {

    // Statisk metod för addition
    public static double addera(double a, double b) {
        return a + b;
    }

    // Statisk metod för subtraktion
    public static double subtrahera(double a, double b) {
        return a - b;
    }

    // Statisk metod för multiplikation
    public static double multiplicera(double a, double b) {
        return a * b;
    }

    // Statisk metod för division
    public static double dividera(double a, double b) {
        if (b == 0) {
            System.out.println("Division med noll är inte tillåtet.");
            return 0;
        }
        return a / b;
    }

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Ange det första numret: ");
        double nummer1 = scanner.nextDouble();

        System.out.println("Ange det andra numret: ");
        double nummer2 = scanner.nextDouble();

        System.out.println("Välj operation: +, -, *, /");
        char operation = scanner.next().charAt(0);

        double resultat;

        switch (operation) {
            case '+':
                resultat = addera(nummer1, nummer2);
                System.out.println("Resultat av addition: " + resultat);
                break;
            case '-':
                resultat = subtrahera(nummer1, nummer2);
                System.out.println("Resultat av subtraktion: " + resultat);
                break;
            case '*':
                resultat = multiplicera(nummer1, nummer2);
                System.out.println("Resultat av multiplikation: " + resultat);
                break;
            case '/':
                resultat = dividera(nummer1, nummer2);
                System.out.println("Resultat av division: " + resultat);
                break;
            default:
                System.out.println("Okänd operation.");
                break;
        }

        scanner.close();
    }
}