package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.Shapes.Circle;
import Lesson9.ShapeProgram.Shapes.Square;
import Lesson9.ShapeProgram.Shapes.Triangle;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    public Integer inputOptionNumber() {
        Scanner inputNr = new Scanner(System.in);
        return inputNr.nextInt();
    }
    public Square inputSquare() {
        System.out.println("Input side of the SQUARE");
        Scanner inputAction = new Scanner(System.in);
        BigDecimal side = inputAction.nextBigDecimal();
        return new Square(side);
    }

    public Triangle inputTriangle() {
        BigDecimal sides [] = new BigDecimal[3];
        for (int i = 0; i < 3; i++) {
            int s=i+1;
            System.out.println("Input TRIANGLE side " + s);
            Scanner inputAction = new Scanner(System.in);
            sides[i] = inputAction.nextBigDecimal();
        }
        return new Triangle(sides[0], sides[1], sides[2]);
    }

    public Circle inputCircle() {
        System.out.println("Input radius of the CIRCLE");
        Scanner inputAction = new Scanner(System.in);
        BigDecimal radius = inputAction.nextBigDecimal();
        return new Circle(radius);
    }
}
