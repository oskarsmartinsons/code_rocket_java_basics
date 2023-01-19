package Lesson3.Task2;

class EquationHacker {
    private int a, b, c;

    public EquationHacker(int a, int b, int c) {
        this.a = a;
        this.b = b;
        this.c = c;
    }
    double getDiscriminant() {
        return (b * b - 4 * a * c);
    }
    double getSingleRoot() {
        return (b / 2 / a * (-1));
    }
    double getRootOne() {
        return (((-1)*b+Math.sqrt(getDiscriminant()))/2);
    }
    double getRootTwo() {
        return (((-1)*b-Math.sqrt(getDiscriminant()))/2);
    }
    void getRoots() {
        double D = getDiscriminant();
        if (D < 0) {
            System.out.println("Discriminant is negative and there are no solution in Real numbers");
        } else if (D == 0) {
            System.out.println("There is one root: " + getSingleRoot());
        } else {
            System.out.println("Root x1 = " + getRootOne());
            System.out.println("Root x2 = " + getRootTwo());
        }
    }
}