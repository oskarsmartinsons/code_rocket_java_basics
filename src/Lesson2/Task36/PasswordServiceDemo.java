package Lesson2.Task36;

class PasswordServiceDemo {
    public static void main(String[] args) {
        String test = UserInput.inputPassword();
        PasswordService passwordService = new PasswordService();
        boolean isValid = passwordService.isValidPassword(test);
        System.out.println(passwordService.printResult(isValid)+test);
    }
}
