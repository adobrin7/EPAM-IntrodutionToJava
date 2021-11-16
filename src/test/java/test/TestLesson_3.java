package test;

import org.junit.Test;
import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

import lesson_3.*;

public class TestLesson_3 {
    @Test
    public void isAscOrderTest() {
        assertTrue(Lesson_3.isAscOrder(new int[]{4, 8, 11, 19, 37, 85}));
        assertFalse(Lesson_3.isAscOrder(new int[]{1, 3, 9, 5, 12, 28, 17}));
    }

    @Test
    public void isDescOrderTest() {
        assertTrue(Lesson_3.isDescOrder(new int[]{103, 79, 50, 42, 20, 9}));
        assertFalse(Lesson_3.isDescOrder(new int[]{19, 13, 5, 97, 11, 43}));
    }

    @Test
    public void isSorted() {
        assertTrue(Lesson_3.isSorted(new int[]{4, 8, 11, 19, 37, 85}, SortOrder.ASC));
        assertFalse(Lesson_3.isSorted(new int[]{1, 3, 9, 5, 12, 28, 17}, SortOrder.ASC));
        assertTrue(Lesson_3.isSorted(new int[]{103, 79, 50, 42, 20, 9}, SortOrder.DESC));
        assertFalse(Lesson_3.isSorted(new int[]{19, 13, 5, 97, 11, 43}, SortOrder.DESC));
    }

    @Test
    public void transformTest() {
        int[] arr = {6, 12, 23, 34, 35, 40};
        assertArrayEquals(new int[]{6, 13, 25, 37, 39, 45}, Lesson_3.transform(arr, SortOrder.ASC));
        assertArrayEquals(new int[]{6, 12, 23, 34, 35, 40}, Lesson_3.transform(arr, SortOrder.DESC));
    }

    @Test
    public void arithmeticProgressionTest() {
        assertEquals(6160, Lesson_3.arithmeticProgression(5, 3, 4));
    }

    @Test
    public void sumGeometricElementsTest() {
        assertEquals(175.0, Lesson_3.sumGeometricElements(100, .5, 20));
    }
}
