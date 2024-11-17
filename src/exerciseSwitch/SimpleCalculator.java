package exerciseSwitch;

import java.util.Scanner;

public class SimpleCalculator {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Välj operation: " + "add, subtract, multiply, divide, max, min, pow, exp, round, floor, ceil");
        String operation = scanner.nextLine();

        double num1 = 0;
        double num2 = 0;

        // Läs in talen efter att användaren valt operation
        switch (operation) {
            case "add":
            case "subtract":
            case "multiply":
            case "divide":
            case "max":
            case "min":
            case "pow":
                System.out.println("Ange första talet:");
                num1 = scanner.nextDouble();
                System.out.println("Ange andra talet:");
                num2 = scanner.nextDouble();
                break;
            case "exp":
            case "round":
            case "floor":
            case "ceil":
                System.out.println("Ange ett tal:");
                num1 = scanner.nextDouble();
                break;
            default:
                System.out.println("Ogiltigt val.");
                return;
        }

        double result = 0;

        // Switch-sats för att utföra vald operation
        switch (operation) {
            case "add":
                result = num1 + num2;
                break;
            case "subtract":
                result = num1 - num2;
                break;
            case "multiply":
                result = num1 * num2;
                break;
            case "divide":
                if (num2 != 0) {
                    result = num1 / num2;
                } else {
                    System.out.println("Fel: Division med noll är ej tillåten.");
                    return;
                }
                break;
            case "max":
                result = Math.max(num1, num2);
                break;
            case "min":
                result = Math.min(num1, num2);
                break;
            case "pow":
                result = Math.pow(num1, num2);
                break;
            case "exp":
                result = Math.exp(num1); // Beräknar e^x
                break;
            case "round":
                result = Math.round(num1);
                break;
            case "floor":
                result = Math.floor(num1);
                break;
            case "ceil":
                result = Math.ceil(num1);
                break;
            default:
                System.out.println("Ogiltigt val.");
                return;
        }

        System.out.println("Resultat: " + result);
    }
}



