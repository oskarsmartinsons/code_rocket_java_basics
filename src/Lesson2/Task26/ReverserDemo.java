package Lesson2.Task26;

public class ReverserDemo {
    public static void main(String[] args) {
        String text = "www.google.com";
        Reverser reverser = new Reverser();
        String modifiedText = reverser.reverseWords(text);
        System.out.println(modifiedText);
    }
}