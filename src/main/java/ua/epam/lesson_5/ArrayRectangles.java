package ua.epam.lesson_5;

class ArrayRectangles {
    private Rectangle[] rectangle_array;
    private int current = -1;

    ArrayRectangles(int length) {
        rectangle_array = new  Rectangle[length];
    }

    ArrayRectangles(Rectangle... rects) {
        this(rects.length);
        for (var rect : rects) {
            boolean isFilled = addRectangle(rect);
            if (!isFilled) {
                break;
            }
        }
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
