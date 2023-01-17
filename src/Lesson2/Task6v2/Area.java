package Lesson2.Task6v2;

import java.util.Scanner;

class Area {
    private final double length;
    private final double breadth;
    public Area (double length, double breadth) {
        this.length = length;
        this.breadth = breadth;
    }
    double returnArea() {
        return length*breadth;
    }

}