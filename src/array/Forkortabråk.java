package array;

import java.util.Scanner;
// 80.Skapa ett program som läser in siffrorna i ett bråk till en array med två platser. Algoritmen
//ska se till att bråket förkortas så långt som möjligt.
//Ex: Om siffrorna i bråket är 6 och 12 ska det lagras i arrayn som 1 och 2.
//Tips: Ta reda på SGD (största gemensamma divisor). I exemplet är SGD 6.

public class Forkortabråk {
    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);
        int[] bråk = new int[2];    // Array med två platser : bråk[0] =täljare . bråk [1]= nämnare

        // Inmatning av siffror
        System.out.print("Ange täljare: ");
        bråk[0] = scanner.nextInt();

        System.out.print("Ange nämnare: ");
        bråk[1] = scanner.nextInt();

        // Hitta största gemensamma delare (SGD)
        int sgd = hittaSGD(bråk[0], bråk[1]);

        // Förkorta bråket genom att dela med SGD
        bråk[0] /= sgd;
        bråk[1] /= sgd;

// Skriv ut det förkortade bråket
        System.out.println("Förkortat bråk: " + bråk[0] + "/" + bråk[1]);

        scanner.close();
    }

    private static int hittaSGD(int a, int b) {

        while (b != 0) {     //Euklides algoritm.
            int temp = b;
            b = a % b;
            a = temp;
        }
        return a;
    }

}



