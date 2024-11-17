package oop;

import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.*;


public class CircleTest {


    // Test för att kontrollera om area beräknas korrekt
    @Test
    void testCalculateArea() {
        Circle circle = new Circle(5.5);
        double expectedArea = 5.5 * 5.5 * 3.14;  // Beräkning förväntad area
        assertEquals(94.985, circle.calculateArea());
    }

    // Test för beräkning av omkrets
    @Test
    public void testCalculateCircumference() {
        Circle circle = new Circle(5.5);
        double expectedCircumference = 2 * 3.14 * 5.5;  // Beräkning förväntad omkrets
        assertEquals(34.54, circle.caculateCircumFerence());
    }


    // Test för jämförelse mellan två cirklar
    @Test
    public void testIsBiggerThan() {
        Circle circle1 = new Circle(7.5);
        Circle circle2 = new Circle(5.5);

        assertTrue(circle1.isBiggerThan(circle2));  // Circle 1 borde vara större
        assertFalse(circle2.isBiggerThan(circle1));  // Circle 2 borde inte vara större
    }


}





