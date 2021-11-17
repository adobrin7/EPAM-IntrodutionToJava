package ua.epam.lesson_5;

public class ArrayRectangles {
    private Rectangle[] rectangle_array;
    private int current;

    ArrayRectangles(int length) {
        rectangle_array = new  Rectangle[length];
        current = -1;
    }

    ArrayRectangles(Rectangle... rects) {
        rectangle_array = rects;
        current = rects.length - 1;
    }

    public boolean addRectangle(Rectangle rect) {
        if (current >= (rectangle_array.length - 1)) {
            return false;
        }
        rectangle_array[++current] = rect;
        return true;
    }

    public int numberMaxArea() {
        int maxIdx = 0;
        for (int i = 1; i < rectangle_array.length; i++) {
            if (rectangle_array[i].area() > rectangle_array[maxIdx].area()) {
                maxIdx = i;
            }
        }
        return maxIdx;
    }

    public int numberMinPerimeter() {
        int minIdx = 0;
        for (int i = 1; i < rectangle_array.length; i++) {
            if (rectangle_array[i].perimeter() < rectangle_array[minIdx].perimeter()) {
                minIdx = i;
            }
        }
        return minIdx;
    }

    public int numberSquare() {
        int count = 0;
        for (var rect : rectangle_array) {
            if (rect.isSquare()) {
                count++;
            }
        }
        return count;
    }
}
