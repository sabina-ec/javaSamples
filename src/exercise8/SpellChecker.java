package exercise8;

public class SpellChecker {

    /*Skapa en metod som heter isLetter(char sign) som kontrollerar om ett tecken (sign) är en engelsk bokstav (a-z)
           Denna metod returnerar true om tecknet är en engelsk bokstav annars false*/

    public boolean isLetter(char sign) {
        //if sing contains in english alphabetic a-z, return true, otherwise return false
        boolean isLetter = false;
        if ((sign >= 'a' && sign <= 'z') || (sign >= 'A' && sign <= 'Z')) {

            isLetter =true;

        }


        return isLetter;

    }
}





