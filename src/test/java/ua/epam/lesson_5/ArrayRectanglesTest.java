package ua.epam.lesson_5;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.*;

public class ArrayRectanglesTest {

    private ArrayRectangles rectangles;

    @Before
    public void setUp() throws Exception {
        Rectangle[] rects = {
                new Rectangle(1),
                new Rectangle(2),
                new Rectangle(3),
        };
        rectangles = new ArrayRectangles(rects);
    }

    @After
    public void tearDown() {
        rectangles = null;
    }

    @Test
    public void addRectangle() {
        Rectangle rect = new Rectangle(0);
        assertFalse(rectangles.addRectangle(rect));
        rectangles = new ArrayRectangles(1);
        assertTrue(rectangles.addRectangle(rect));
    }

    @Test
    public void numberMaxArea() {
        assertEquals(2, rectangles.numberMaxArea());
    }

    @Test
    public void numberMinPerimeter() {
        assertEquals(0, rectangles.numberMinPerimeter());
    }

    @Test
    public void numberSquare() {
        assertEquals(0, rectangles.numberSquare());
        rectangles = new ArrayRectangles(1);
        rectangles.addRectangle(new Rectangle(7, 7));
        assertEquals(1, rectangles.numberSquare());
    }
}