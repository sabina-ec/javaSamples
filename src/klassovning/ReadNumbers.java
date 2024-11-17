package klassovning;

import java.util.Scanner;

public class ReadNumbers {
/*44.Skapa ett program som låter användaren bestämma hur många tal han vill summera. Läs in
    detta antal tal och summera dem Skriv ut summan.*/

    public static void main(String[] args) {


        Scanner scannerInput = new Scanner(System.in);
        System.out.println(" skriv in antal nummer :5");
        int antalNumbers = scannerInput.nextInt();
        System.out.println(antalNumbers);
        int sum = 0;
        for (int i = 0; i < antalNumbers; i++) {
            System.out.print("skriv ett term");
            int number = scannerInput.nextInt();
            System.out.println(sum + "+" +number + " ");
            sum = sum + number;
            System.out.println();
        }


        System.out.println(sum);

    }


}
