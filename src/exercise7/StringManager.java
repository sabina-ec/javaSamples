package exercise7;

public class StringManager {
    public static void main(String[] args) {

        String myString = "some text";

        if (myString.equals("some text")) {

            System.out.println("yes , the text is the same!");

            //do something

        }

        //Om vi vill veta längden av en String användare vi metoden length


        if (myString.length() == 9) {
            System.out.println("the text is exactly 9 characters"); //do something

        }

        System.out.println(myString.charAt(3));


    }

}
