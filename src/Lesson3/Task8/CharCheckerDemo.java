package Lesson3.Task8;

class CharCheckerDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String letter = userInput.inputChar();
        CharChecker charChecker = new CharChecker(letter);
        charChecker.isVowel();
    }
}
