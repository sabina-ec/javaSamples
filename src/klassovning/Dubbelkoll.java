package klassovning;

//.Läs in två tal. Testa om det första talet är mer än dubbelt så stort som det andra talet. I så
//fall ska meddelandet “För stort“ skrivas ut.

public class Dubbelkoll {

    public static void main(String[] args) {

    int number1 =15;
    int number2=7;

    if(number1>2*number2){

        System.out.println("For stort");

    }
    else {

        System.out.println("Inte för stort");
    }

    }

}
