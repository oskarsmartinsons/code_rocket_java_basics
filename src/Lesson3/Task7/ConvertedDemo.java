package Lesson3.Task7;

class ConvertedDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Converter converter = new Converter(userInput.inputMonth(), userInput.inputYear());
        converter.returnDays();
    }
}
