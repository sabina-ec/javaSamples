package exercise6;

public class PetZoo {

    private static String petName;

    public static void main(String[] args) {

        Pet dog = new Pet("Fido");
        Pet cat = new Pet("Laka");
        Pet rabbit = new Pet("Kala");

        /*dog.printName();
        cat.printName();
        rabbit.printName();*/

        /*Använd denna metod ifrån klassen PetZoo på dina tre nyligen skapade objekt och spara värdet i en variabel

         Skriv ut namnen två gånger ifrån PetZoo*/

        String dogName = dog.getName();
        String catName = cat.getName();
        String rabbitName = rabbit.getName();

        for (int i = 0; i < 2; i++) {
            System.out.println(dogName);
            System.out.println(catName);
            System.out.println(rabbitName);



        }

        }


    }





