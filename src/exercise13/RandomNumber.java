package exercise13;

public class RandomNumber {
    public static void main(String[] args) {

        // difine the range
        int min = 1;
        int max = 10;
        int range = max - min + 1;

        // generate random numbers from min to max
        for (int i = 0; i < 10; i++) {
            int rand = (int) (Math.random() * range) + min;
            System.out.println(rand);
        }
    }

}
