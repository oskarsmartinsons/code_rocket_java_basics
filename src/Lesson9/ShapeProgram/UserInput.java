package Lesson9.ShapeProgram;

import Lesson9.ShapeProgram.Shapes.Circle;
import Lesson9.ShapeProgram.Shapes.ShapeType;
import Lesson9.ShapeProgram.Shapes.Square;
import Lesson9.ShapeProgram.Shapes.Triangle;

import java.math.BigDecimal;
import java.util.Scanner;

public class UserInput {
    public Integer inputNumber() {
        Scanner inputAction = new Scanner(System.in);
        return inputAction.nextInt();
    }
    public Square inputSquare() {
        System.out.println("Input side of the square");
        Scanner inputAction = new Scanner(System.in);
        BigDecimal side = inputAction.nextBigDecimal();
        return new Square(side);
    }

    public Triangle inputTriangle() {
        BigDecimal sides [] = new BigDecimal[3];
        for (int i = 0; i < 2; i++) {
            int s=i+1;
            System.out.println("Input triangle side " + s);
            Scanner inputAction = new Scanner(System.in);
            sides[i] = inputAction.nextBigDecimal();
        }
        return new Triangle(sides[0], sides[1], sides[2]);
    }

    public Circle inputCircle() {
        System.out.println("Input radius of the circle");
        Scanner inputAction = new Scanner(System.in);
        BigDecimal radius = inputAction.nextBigDecimal();
        return new Circle(radius);
    }

    public ShapeType inputType() {
        Scanner userInput = new Scanner(System.in);
        System.out.println("Choose shape type by number SQUARE - 1, TRIANGLE - 2, CIRCLE - 3 " );
        return ShapeType.valueOf(userInput.nextLine());
    }
}
