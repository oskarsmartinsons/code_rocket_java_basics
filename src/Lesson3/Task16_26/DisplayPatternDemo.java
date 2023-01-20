package Lesson3.Task16_26;

class DisplayPatternDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        DisplayPattern pattern = new DisplayPattern(userInput.inputNumber());
        pattern.patternOne(); // Task 16
        pattern.patternTwo(); // Task 17
        pattern.patternThree(); // Task 18, also  Floyd Task 20
        pattern.patternPyramid(); // Task 19
        pattern.patternDiamond();// Task 21
        pattern.patternPascalTriangle(); // Task 22
        pattern.patternStar(); // Task 23
        pattern.patternAt(); // Task 24
        pattern.patternNumberRhombus(); // Task 25
        pattern.patternCharRhombus();// Task 26
    }
}