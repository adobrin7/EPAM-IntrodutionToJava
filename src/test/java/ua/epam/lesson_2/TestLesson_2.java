package ua.epam.lesson_2;

import org.junit.Test;
import static junit.framework.TestCase.*;
import static org.junit.Assert.assertArrayEquals;

public class TestLesson_2 {
    @Test
    public void task_1() {
        assertArrayEquals(new int[]{4, 5, 3, 10}, Lesson_2.task_1(new int[]{10, 5, 3, 4}));
    }

    @Test
    public void task_2() {
        assertEquals(0, Lesson_2.task_2(new int[]{4, 100, 3, 4}));
        assertEquals(1, Lesson_2.task_2(new int[]{5, 50, 50, 4, 5}));
        assertEquals(3, Lesson_2.task_2(new int[]{5, 350, 350, 4, 350}));
        assertEquals(4, Lesson_2.task_2(new int[]{10, 10, 10, 10, 10}));
    }

    @Test
    public void task_3() {
        int[][] param = {
                {2, 4, 3, 3},
                {5, 7, 8, 5},
                {2, 4, 3, 3},
                {5, 7, 8, 5},
        };
        int[][] expected = {
                {2, 1, 1, 1},
                {0, 7, 1, 1},
                {0, 0, 3, 1},
                {0, 0, 0, 5},
        };
        assertTrue(compareMatrix(expected, Lesson_2.task_3(param)));
    }

    private boolean compareMatrix(int[][] a, int[][] b) {
        int row1 = a.length;
        int col1 = a[0].length;
        int row2 = b.length;
        int col2 = b[0].length;
        boolean flag = true;

        if(row1 != row2 || col1 != col2) {
            return false;
        }
        else {
            for(int i = 0; i < row1; i++){
                for(int j = 0; j < col1; j++){
                    if(a[i][j] != b[i][j]){
                        flag = false;
                        break;
                    }
                }
            }
            return flag;
        }
    }
}
