package Lesson3.Task8;

class CharChecker {
    private final char myChar;
    public CharChecker(String myChar) {
        this.myChar = myChar.charAt(0);
    }
    void isVowel() {
        if (myChar == 'a' || myChar == 'e' || myChar == 'i' || myChar == 'o' || myChar == 'u' ||
                myChar == 'A' || myChar == 'E' || myChar == 'I' || myChar == 'O' || myChar == 'U') {
            System.out.println("Input letter is Vowel");
        } else {
            System.out.println("Input letter is Consonant");
        }
    }
}
