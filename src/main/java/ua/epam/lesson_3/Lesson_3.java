package ua.epam.lesson_3;

import java.util.Arrays;

public class Lesson_3 {
    public static boolean isAscOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] > arr[i + 1])
                return false;
        }
        return true;
    }

    public static boolean isDescOrder(int[] arr) {
        for (int i = 0; i < arr.length - 1; i++) {
            if (arr[i] < arr[i + 1])
                return false;
        }
        return true;
    }

    public static boolean isSorted(int[] arr, SortOrder sortOrder) {
        return (sortOrder == SortOrder.ASC) ? isAscOrder(arr) : isDescOrder(arr);
    }

    public static int[] transform(int[] arr, SortOrder sortOrder) {
        int[] tmp = Arrays.copyOf(arr, arr.length);
        if (isSorted(arr, sortOrder)) {
            for (int i = 0; i < arr.length; i++) {
                tmp[i] += i;
            }
        }
        return tmp;
    }

    public static int arithmeticProgression(int a1, int t, int n) {
        if (a1 < 1) {
            return 0;
        }
        int res = 1;
        for (int i = 0; i < n; i++) {
            res *= a1;
            a1 += t;
        }
        return res;
    }

    public static double sumGeometricElements(double a1, double t, double alim) {
        if (a1 < 1) {
            return 0;
        }
        double res = 0;
        while (a1 > alim) {
            res += a1;
            a1 *= t;
        }
        return res;
    }
}
