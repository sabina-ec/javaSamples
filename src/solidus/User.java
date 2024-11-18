package solidus;

public class User {

    private int balance;

    public User() {
        this.balance = 5;  // Initial balance
    }
    public int getBalance() {
        return balance;
    }
    public void becomeGoldMember() {
        this.balance += 20;  // Add 20 solidus
    }
    public void login() {
        this.balance += 1;  // Add 1 solidus on login
    }
    public boolean withdraw(int amount) {
        if (amount <= balance) {
            this.balance -= amount;
            return true;
        }
        return false;
    }


    public boolean purchase(String item) {
        int cost;
        switch (item.toLowerCase()) {
            case "hoodie":
                cost = 20;
                break;
            case "t-shirt":
                cost = 15;
                break;
            case "stickers":
                cost = 5;
                break;
            default:
                return false;
        }
        return withdraw(cost);  // Use withdraw method to deduct cost
    }
}






