package exercise6;

public class Pet {

    private String name;              //atribut

    public Pet(String petName) {     //konstruktor
        name = petName;


    }

    public void printName() {

        System.out.println("The name of the pet is:" + name);
    }

    /* Skapa en ny metod i klassen Pet som skriver ut returnerar attributet name*/

    public String getName() {
        return name;
    }


}




