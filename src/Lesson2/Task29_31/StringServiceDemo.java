package Lesson2.Task29_31;

class StringServiceDemo {
    public static void main(String[] args) {
        // get input
        String test = UserInput.input();
        StringService stringService = new StringService();
        // analyze
        String middleChars =  stringService.returnMiddle(test);
        String vowelCount = stringService.countVowels(test);
        String wordCount = stringService.countWords(test);
        // Print out
        System.out.println(middleChars);
        System.out.println(vowelCount);
        System.out.println(wordCount);
    }
}