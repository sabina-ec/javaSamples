package klassovning;

public class OneCharAtTime {
 //4.Skapa ett program som har en mening och skriver ut ett tecken i taget tills en * skrivs in.

    public static void main(String[] args) {

    String string="Bästa klassen ni är så bra* eller hur";
     int i =0;
    while (string.charAt(i) !='*') {
            System.out.println(string.charAt(i));
            i++;

        }
    }

}


/*public class TeckenUtmatning {
    public static void main(String[] args) {
        // Definiera en mening direkt i koden
        String mening = "Hej! Hur mår du?* Det här ignoreras.";

        // Gå igenom varje tecken i strängen
        for (int i = 0; i < mening.length(); i++) {
            char tecken = mening.charAt(i); // Hämtar ett tecken i taget
            if (tecken == '*') {
                break; // Stoppar loopen när * hittas
            }
            System.out.print(tecken);
        }
    }
}*/
