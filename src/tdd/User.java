package tdd;

public class User {

    String username, password;  // atribut (klass, instans )varijabler.
    private String typeOfUser;
private String types="normal admin super";

    // konstruktor med två string argument (parametrar) körs en gång vid "new"
    public User(String user, String pwd) {
        username = user;
        password = pwd;


    }

    public String getUsername() {
        return username;
    }

    public String getPassword() {
        return password;

    }

    public void setUsername(String newUser) {
        if (newUser.length() >= 4) username = newUser;

    }


    public String getTypeOfUser() {
        return typeOfUser;
    }


    public void setTypeOfUser(String admin) {
    }
public void setTypOfUser(String newtype) {
    if (types.contains(newtype)) typeOfUser = newtype;

}


}



