package ua.epam.lesson_1;

import org.junit.Test;
import static junit.framework.TestCase.*;

public class TestLesson_1 {
    @Test
    public void task_1() {
        assertEquals(16, Lesson_1.task_1(4));
        assertEquals(5, Lesson_1.task_1(-5));
        assertEquals(0, Lesson_1.task_1(0));
    }

    @Test
    public void task_2() {
        assertEquals(651, Lesson_1.task_2(165));
        assertEquals(651, Lesson_1.task_2(561));
        assertEquals(0, Lesson_1.task_2(1234));
    }

    @Test
    public void task_3() {
        assertEquals(4, Lesson_1.task_3(1234));
        assertEquals(0, Lesson_1.task_3(246));
        assertEquals(0, Lesson_1.task_3(-1234));
    }

    @Test
    public void task_4() {
        assertEquals(3, Lesson_1.task_4(14));
        assertEquals(1, Lesson_1.task_4(128));
        assertEquals(0, Lesson_1.task_4(-1));
    }
}
