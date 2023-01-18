package Lesson2.Task34;

class CharPrinter {
    void charPrinter(char first, char second, int perLine) {
        int ctr =0;
        while (first <= second) {
            ctr++;
            System.out.print(first + " ");
            if (ctr % perLine == 0) System.out.println("");
            first++;
        }
        System.out.print("\n");
    }
}

