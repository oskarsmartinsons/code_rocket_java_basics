package Lesson2.Task4;
import static java.lang.Math.sqrt;
public class TriangleConstructor {
        private final double side1;
        private final double side2;
        private final double side3;

        public TriangleConstructor (double side1, double side2, double side3) {
            this.side1 = side1;
            this.side2 = side2;
            this.side3 = side3;
        }
        public double getSide1() {
            return side1;
        }
        public double getSide2() {
            return side2;
        }
        public double getSide3() {
            return side3;
        }

        // calculate perimeter
        static double calculatePerimeter(TriangleConstructor triangle) {
            return triangle.getSide1()+triangle.getSide2()+triangle.getSide3();
        }

        // calculate area
        static double calculateArea(TriangleConstructor triangle) {
            double semiPerimeter =  calculatePerimeter(triangle)/2;
            return sqrt(semiPerimeter*
                    (semiPerimeter- triangle.getSide1())*
                    (semiPerimeter- triangle.getSide2())*
                    (semiPerimeter-triangle.getSide3()));
        }
}
