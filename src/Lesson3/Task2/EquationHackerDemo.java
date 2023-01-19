package Lesson3.Task2;

class EquationHackerDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        int [] inputs = userInput.input();
        EquationHacker equationHacker = new EquationHacker(inputs[0],inputs[1],inputs[2] );
        equationHacker.getRoots();
    }
}