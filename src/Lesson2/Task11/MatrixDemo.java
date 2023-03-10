package Lesson2.Task11;

public class MatrixDemo {
    public static void main(String[] args) {
        Matrix firstMatrix = new Matrix(2,2);
        Matrix secondMatrix = new Matrix (2,2);

        firstMatrix.setElement(0,0,1);
        firstMatrix.setElement(0,1,2);
        firstMatrix.setElement(1,0,3);
        firstMatrix.setElement(1,1,4);

        secondMatrix.setElement(0,0,1);
        secondMatrix.setElement(0,1,2);
        secondMatrix.setElement(1,0,3);
        secondMatrix.setElement(1,1,4);

        Matrix resultSum=firstMatrix.adding(secondMatrix);
        resultSum.printMatrix();

        Matrix resultMultiplication=firstMatrix.multiply(secondMatrix);
        resultMultiplication.printMatrix();
    }
}
