package Lesson2.Task26;

class Reverser {
    String reverseWords(String text) {
        String newText = "";
        String subString="";
        for (int i = 0; i < text.length(); i++) {
            if (!Character.isAlphabetic(text.charAt(i)) || (i==text.length()-1)) {
                newText = newText+subString+text.charAt(i);
                subString="";
                continue;
            }
            subString = text.charAt(i)+ subString;
        }
        return newText;
    }
}