package Lesson2.Task37;

class RandomMatrix {
    void createMatrix (int n) {
        int [][] array = new int [n][n];
        for (int row = 0; row < n; row++) {
            for (int col = 0; col < n; col++) {
                int value = (int) Math.round(Math.random());
                array [row][col] = value;
                System.out.print(array[row][col]+" ");
            }
            System.out.println(" ");
        }
    }
}
