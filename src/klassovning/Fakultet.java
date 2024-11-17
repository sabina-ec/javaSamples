package klassovning;

public class Fakultet {

    /*Skapa ett program som skriver ut n! (fakulteten). n ska läsas in.
    Ex: 3! = 1 * 2 * 3 5! = 1 * 2 * 3 * 4 * 5 */

    public static void main(String[] args) {

    int fakultet=12;
    int produkt=1;
    for (int i =0; i<=fakultet;i++) {
        produkt = produkt * i;
        System.out.println(i +"*");




    }

        System.out.println(produkt);

    }



}
