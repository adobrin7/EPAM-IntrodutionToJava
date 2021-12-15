package ua.epam.lesson_9;

public class Matrix {
    private double[][] matrix;

    public Matrix(int row, int column) {
        if (row <= 0 || column <= 0) {
            throw new IllegalArgumentException("Illegal number of row or column");
        }
        matrix = new double[row][column];
    }

    public Matrix(double[][] matrix) {
        this.matrix = matrix;
    }

    public int getRow() {
        return matrix.length;
    }

    public int getColumn() {
        return matrix[0].length;
    }

    public double[][] getMatrix() {
        return matrix;
    }

    public void setElement(int row, int column, double data) {
        if (row < 0 || column < 0 || row >= getRow() || column >= getColumn()) {
            throw new IllegalArgumentException("Illegal number of row or column");
        }

        matrix[row][column] = data;
    }

    public Matrix addition(Matrix secondMatrix) throws MatrixException {
        if (getRow() != secondMatrix.getRow() || getColumn() != secondMatrix.getColumn()) {
            throw new MatrixException("Operations with matrix of incompatible sizes", this, secondMatrix);
        }

        double[][] resultMatrix = new double[getRow()][getColumn()];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                resultMatrix[i][j] = getMatrix()[i][j] + secondMatrix.getMatrix()[i][j];
            }
        }

        return new Matrix(resultMatrix);
    }

    public Matrix deduction(Matrix secondMatrix) throws MatrixException {
        if (getRow() != secondMatrix.getRow() || getColumn() != secondMatrix.getColumn()) {
            throw new MatrixException("Operations with matrix of incompatible sizes", this, secondMatrix);
        }

        double[][] resultMatrix = new double[getRow()][getColumn()];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < getColumn(); j++) {
                resultMatrix[i][j] = getMatrix()[i][j] - secondMatrix.getMatrix()[i][j];
            }
        }

        return new Matrix(resultMatrix);
    }

    public Matrix multiplication(Matrix secondMatrix) throws MatrixException {
        if (getColumn() != secondMatrix.getRow()) {
            throw new MatrixException("Operations with matrix of incompatible sizes", this, secondMatrix);
        }

        double[][] resultMatrix = new double[getRow()][secondMatrix.getColumn()];
        for (int i = 0; i < getRow(); i++) {
            for (int j = 0; j < secondMatrix.getColumn(); j++) {
                for (int k = 0; k < getColumn(); k++) {
                    resultMatrix[i][j] += getMatrix()[i][k] * secondMatrix.getMatrix()[k][j];
                }
            }
        }

        return new Matrix(resultMatrix);
    }
}