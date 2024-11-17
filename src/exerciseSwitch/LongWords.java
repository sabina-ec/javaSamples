package exerciseSwitch;

import java.util.Scanner;

public class LongWords {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        String letter = scan.nextLine();

        switch (letter) {
            case "A":
                System.out.println("Adis");
                break;
            case "S":
                System.out.println("Sabina");
                break;

            case "D":
                System.out.println("Davud");
                break;
            default:
                System.out.println("felaktig bokstav");
        }
        scan.close();
    }
}