package exercise5;

import java.util.ArrayList;
import java.util.List;

public class MyCar {

    public static void main(String[] args) {
        Car myCar = new Car();
        myCar.setColor("Yellow");

        Car adis = new Car();
        System.out.println("Adisov auto "  + adis.getColor());
        adis.setColor("Yugo");

        System.out.println("Adisov auto "  + adis.getColor());
        System.out.println("Sabinin auto "  + myCar.getColor());
    }


}
