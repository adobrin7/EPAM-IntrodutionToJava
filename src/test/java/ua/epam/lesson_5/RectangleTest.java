package ua.epam.lesson_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class RectangleTest {

    private Rectangle rectangle;
    private final double delta = 0.00001;

    @Before
    public void startUp() {
        rectangle = new Rectangle(8.0, 7.0);
    }

    @After
    public void tearDown() {
        rectangle = null;
    }

    @Test
    public void getSideA() {
        assertEquals(8.0, rectangle.getSideA(), delta);
    }

    @Test
    public void getSideB() {
        assertEquals(7.0, rectangle.getSideB(), delta);
    }

    @Test
    public void area() {
        assertEquals(56.0, rectangle.area(), delta);
    }

    @Test
    public void perimeter() {
        assertEquals(30.0, rectangle.perimeter(), delta);
    }

    @Test
    public void isSquare() {
        assertFalse(rectangle.isSquare());
        assertTrue(new Rectangle(5).isSquare());
    }

    @Test
    public void swapSides() {
        rectangle.swapSides();
        assertEquals(7.0, rectangle.getSideA(), delta);
        assertEquals(8.0, rectangle.getSideB(), delta);
    }
}