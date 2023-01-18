package Lesson2.Task38;

import static java.lang.Math.sqrt;

class TriangleHelper {
    private final double side1;
    private final double side2;
    private final double side3;

    public TriangleHelper(double side1, double side2, double side3) {
        this.side1 = side1;
        this.side2 = side2;
        this.side3 = side3;
    }
    double calculateArea () {
        double semiPerimeter =  (side1+side2+side3)/2;
        return sqrt(semiPerimeter*
                (semiPerimeter-side1)*
                (semiPerimeter-side2)*
                (semiPerimeter-side3));
    }
}
