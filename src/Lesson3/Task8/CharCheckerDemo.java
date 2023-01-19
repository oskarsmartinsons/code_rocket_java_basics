package Lesson3.Task8;

class CharCheckerDemo {
    public static void main(String[] args) {
        //get input
        UserInput userInput = new UserInput();
        String letter = userInput.inputChar();
        // validate input
        boolean isValid = userInput.isInputValid(letter);
        if (!isValid) {return;}
        // check char
        CharChecker charChecker = new CharChecker(letter);
        charChecker.isVowel();
    }
}
