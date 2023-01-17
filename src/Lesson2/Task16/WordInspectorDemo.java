package Lesson2.Task16;

import org.w3c.dom.ls.LSOutput;

public class WordInspectorDemo {
    public static void main(String[] args) {
        UserInput userInput = new UserInput();
        String fullName = userInput.input();

        WordInspector wordInspector = new WordInspector();
        String modifiedName=wordInspector.modifyName(fullName);

        System.out.println("My modified name: " + fullName);
        System.out.println("My modified name: " + modifiedName);
    }
}
