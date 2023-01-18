package Lesson2.Task33;

public class Pentagon {
    int getNumbersOfPentagon(int i) {
        return (i * (3 * i - 1))/2;
    }

    void printPentagon () {
        int countInRow = 1;
        for(int i = 1; i <= 50; i++){
            System.out.printf("%-6d",getNumbersOfPentagon(i));
            if(countInRow % 10 == 0) System.out.println();
            countInRow++;
        }
    }
}
