package Lesson2.Task48;

class VowelExpertDemo {
    public static void main(String[] args) {
        String test = UserInput.inputString();
        VowelExpert vowelExpert = new VowelExpert();
        boolean isAllVowels = vowelExpert.isAllVowels(test);
        System.out.println("Check all the characters of the said string are vowels or not! " + isAllVowels);
    }
}
