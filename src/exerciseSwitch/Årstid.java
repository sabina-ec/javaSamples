package exerciseSwitch;

import java.util.Scanner;

//Låt användaren ange en månad (exempelvis januari, februari etc.)
//och använd en switch-sats för att skriva ut vilken årstid det är

public class Årstid {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Ange en månad från januari till december");
        String month = scan.nextLine().toLowerCase();
        String season;
        switch (month) {
            case "december":
            case "januari":
            case "februari":
                season = "vinter";
                break;
            case "mart":
            case "april":
            case "maj":
                season = "vår";
                break;
            case "juni ":
            case "juli":
            case "augusti":
                season = "sommar";
                break;
            case "september":
            case "october":
            case "november":
                season = "höst";
                break;
            default:
                season = "Ogiltig månad";
                break;

        }
        System.out.println("Årstiden är: " + season);
    }


}
