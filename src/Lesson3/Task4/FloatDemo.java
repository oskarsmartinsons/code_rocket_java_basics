package Lesson3.Task4;

class FloatDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        Float myFloat = new Float(userInput.inputFloat());
        String result = myFloat.checkFloat();
        System.out.println(result);
    }
}