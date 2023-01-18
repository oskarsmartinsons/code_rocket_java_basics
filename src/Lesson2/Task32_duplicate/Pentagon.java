package Lesson2.Task32_duplicate;

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
