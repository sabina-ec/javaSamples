package oop;


public class CircleMain {

    public static void main(String[] args) {
        Circle circle1 = new Circle(5.5);
        System.out.println("Circle 1 - Radien: " + circle1.getRadien());
        System.out.println("Circle 1 - Area: " + circle1.calculateArea());
        System.out.println("Circle 1 - Omkrets: " + circle1.caculateCircumFerence());

        System.out.println("-------------------------------------");

        Circle circle2 = new Circle(7.5);

        System.out.println("Circle 2 - Radien: " + circle2.getRadien());
        System.out.println("Circle 2 - Area: " + circle2.calculateArea());
        System.out.println("Circle 2 - Omkrets: " + circle2.caculateCircumFerence());


        // Jämför om circle1 är större än circle2
        if (circle1.isBiggerThan(circle2)) {
            System.out.println("\nCircle 1 har en större area än Circle 2.");
        } else {
            System.out.println("\nCircle 1 har inte en större area än Circle 2.");

        }

    }
}