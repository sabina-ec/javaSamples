package exercise12;

import java.util.Scanner;

public class SquereRoot {
    public static void main(String[] args) {
        // skapa en metod som läser in två kateter (a och b ) på en triangel och räknar ut hypotenusan

        Scanner scan = new Scanner(System.in);
        int a = Integer.parseInt(scan.nextLine());
        int b = Integer.parseInt(scan.nextLine());
//Tips: hypotenusen i kvadrat är lika med summan av kvadraterna av kateterna

        // a*a + b*b= c*c
        //c= sqrt(a*a + b*b)

        double c = Math.sqrt(a * a + b * b);

        System.out.println(" Hypotenusan blir c=  " + c);
    }


}
