package ua.epam.lesson_2;

public class Lesson_2 {
    public static int[] task_1(int[] arr) {
        int len = arr.length;
        for (int i = 0, j = len - 1; i < len && i <= j; i++, j--) {
            if (arr[i] % 2 == 0 && arr[j] % 2 == 0) {
                int holder = arr[j];
                arr[j] = arr[i];
                arr[i] = holder;
            }
        }
        return arr;
    }

    public static int task_2(int[] arr) {
        int firstMaxIdx = 0;
        int lastMaxIdx = 0;
        long max = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] > max) {
                max = arr[i];
                firstMaxIdx = i;
            }
            if (arr[i] >= max) {
                lastMaxIdx = i;
            }
        }
        return lastMaxIdx - firstMaxIdx;
    }

    public static int[][] task_3(int[][] matrix) {
        for (int i = 0; i < matrix.length; i++) {
            for (int j = 0; j < matrix.length; j++) {
                if (j > i) {
                    matrix[i][j] = 1;
                }
                if (j < i) {
                    matrix[i][j] = 0;
                }
            }
        }
        return matrix;
    }
}
