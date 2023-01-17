package Lesson2.Task12_15;

public class StringCheckDemo {
    public static void main(String[] args) {
        StringCheck stringCheck = new StringCheck();
        // Task 11
        stringCheck.checkLength("refrigerator");
        // Task 12
        stringCheck.checkLetter("Umbrella","e");
        // Task 13
        stringCheck.checkWord("This is orange juice","orange");
        // Task 14
        stringCheck.checkOccurance("Hello, World","o");
        stringCheck.checkOccurance("Hello, World",",");
    }
}
