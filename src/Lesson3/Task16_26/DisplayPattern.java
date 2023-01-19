package Lesson3.Task16_26;

class DisplayPattern {
    private final int number;
    public DisplayPattern(int number) {
        this.number = number;
    }

    void patternOne() {
        System.out.println("========= Pattern One ===============");
        int k =0;
            for (int j = 1; j <= number; j++) {
                k = k + j;
                System.out.printf("%d%n",k);
                k = k*10;
            }
    }
    void patternTwo() {
        System.out.println("========= Pattern Two ===============");
        for (int i = 1; i <= number; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.printf("%d",i);
            }
            System.out.println();
        }
    }
    void patternThree() {
        int k=1;
        System.out.println("========= Pattern Three (Floyd's Triangle) ===========");
        for(int row=1;row<=number;row++) {
            for(int j=1;j<=row;j++)
                System.out.printf("%s ", k++);
                System.out.println();
        }
    }

    void patternDiamond() {
        System.out.println("========= Pattern Diamond ===============");
        int space = number-1;
        for (int row = 1; row <= number; row++) {
            for (int s = 1; s <=space ; s++) {
                System.out.print(" ");
            }
            for(int repeat = 1; repeat<=(2*row-1); repeat++) {
                System.out.print("*");
            }
            System.out.println();
            space--;
        }
        // downside
        space = 1;
        for (int row = number-1; row >=1; row--) {
            for (int s = 1; s <=space ; s++) {
                System.out.print(" ");
            }
            for(int repeat = 1; repeat<=(2*row-1); repeat++) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
    void patternPyramid() {
        System.out.println("========= Pattern Pyramid ===============");
        int space = number-1;
        for (int row = 1; row <= number; row++) {
            for (int s = 1; s <=space ; s++) {
                System.out.print(" ");
            }
            for(int repeat = 1; repeat<=row; repeat++) {
                System.out.print(row + " ");
            }
            System.out.println();
            space--;
        }
    }
   void patternAt() {
        System.out.println("========= Pattern @ Triangle ===============");
        int space = number-1;
        for (int row = 1; row <= number; row++) {
            for (int s = 1; s <=space ; s++) {
                System.out.print(" ");
            }
            for(int repeat = 1; repeat<=row; repeat++) {
                System.out.print("@");
            }
            System.out.println();
            space--;
        }
    }

    void patternStar() {
        System.out.println("========= Pattern * Triangle ===============");
        int space = 0;
        for (int row = 1; row <= number; row++) {
            for (int s = 0; s<space ; s++) {
                System.out.print(" ");
            }
            for(int repeat = number; repeat>=row; repeat--) {
                System.out.print("*");
            }
            System.out.println();
            space++;
        }
    }
}
