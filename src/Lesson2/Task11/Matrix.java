package Lesson2.Task11;

class Matrix {
    private final int rows;
    private final int columns;
    private final int [][] array;

    public Matrix(int rows, int columns) {
        this.rows = rows;
        this.columns = columns;
        array = new int [rows][columns];
    }

    public int getRows() {
        return rows;
    }
    public int getColumns() {return columns;}

    public int getElement( int row, int col) {
        return array[row][col];
    }
    public void setElement(int row, int col, int value) {
        array[row][col]=value;
    }

    public Matrix adding(Matrix second) {
        Matrix first = this;
        if ((first.getRows() != second.getRows()) || (first.getColumns() != second.getColumns())) {
            System.out.println("Matrices cannot be added");
        }
        Matrix result = new Matrix(rows,columns);
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                int value = first.getElement(i,j) + second.getElement(i,j);
                result.setElement(i,j,value);
            }
        }
        return result;
    }

    public Matrix multiply(Matrix second) {
        Matrix first = this;
        if (first.columns!= second.rows) {
            System.out.println("Matrices cannot be multiplied");
        }
        Matrix result = new Matrix(first.rows,second.columns);
        for (int i = 0; i < result.rows; i++) {
            for (int j = 0; j < result.columns; j++) {
                int value = 0;
                for (int k = 0; k < result.columns; k++) {
                    value += first.getElement(i,k) * second.getElement(k,j);
                }
                result.setElement(i,j,value);
            }
        }
        return result;
    }

    public void printMatrix() {
        System.out.println("========  Result =============");
        for (int i = 0; i < columns; i++) {
            for (int j = 0; j < rows; j++) {
                System.out.print(this.getElement(i, j)+" ");
            }
            System.out.println();
        }
    }
}
