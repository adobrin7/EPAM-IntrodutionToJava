package ua.epam.lesson_5;

class Rectangle {
    private double sideA;
    private double sideB;

    Rectangle(double sideA, double sideB) {
        this.sideA = Math.abs(sideA);
        this.sideB = Math.abs(sideB);
    }

    Rectangle(double sideA) {
        this(sideA, 5);
    }

    public double getSideA() {
        return sideA;
    }

    public double getSideB() {
        return sideB;
    }

    public double area() {
        return sideA * sideB;
    }

    public double perimeter() {
        return (sideA * 2) + (sideB * 2);
    }

    public boolean isSquare() {
        return sideA == sideB;
    }

    public void swapSides() {
        double holder = sideA;
        sideA = sideB;
        sideB = holder;
    }
}
