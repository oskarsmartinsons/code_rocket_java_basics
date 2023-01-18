package Lesson2.Task20;

class PalindromDemo {
    public static void main(String[] args) {
        String test = "aca";
        Palindrom palindrom = new Palindrom();
        boolean result = palindrom.isPalindrome(test);
        System.out.printf("Is '%s' palindrome? : %s ", test, result);
    }
}