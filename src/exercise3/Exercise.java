package exercise3;

public class Exercise {

    public static void main(String[] args) {

        int tal = 1;

        while (tal <= 100) {
            System.out.println(tal);

            tal = tal + 1;


        }
        System.out.println();

        int even = 2;
        while (even <= 100) {

            System.out.println(even + 2);
            even = even + 2;

        }

        System.out.println();
        int first = 1;
        int second = 1;


        while (second <= 100) {

            System.out.println(second);
            int third = first + second;
            first = second;
            second = third;

        }

    }


}
