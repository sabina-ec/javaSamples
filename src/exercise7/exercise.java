package exercise7;

import java.util.Scanner;

public class exercise {
    public static void main(String[] args) {

        //Läs in en String (scan.nextLine())
        //Använd en for-loop och skriv ut tecken för tecken innehållet i Stringen
        //Om man skriver ordet "ägg" så skrivs meningen "ägg är knasigt" ut​

        Scanner scan = new Scanner(System.in);

        String text = scan.nextLine();
        String myString = "some text";
        int textLength = myString.length();
        if (text.equals("ägg")) {
            System.out.println("ägg är knasigt");
        }else{
                for (int i = 0; i < text.length(); i++) {
                    System.out.println(text.charAt(i) + " ");
                }
            }

        }


    }


