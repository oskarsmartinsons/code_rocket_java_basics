package Lesson2.Task16;

import org.w3c.dom.ls.LSOutput;

class WordInspector {
   // String name;
    String lastName="";
    String firstLetters="";
    public String modifyName (String name ) {

        //get last name without first letter
        for (int i = name.length() - 1; i >= 0; i--) {
            if (name.charAt(i - 1) == ' ') {
                break;
            }
            lastName = name.charAt(i) + lastName;
        }

        //get first letters names
        for (int i = name.length() - 1; i >= 0; i--) {
         if (name.charAt(i)==' ') {
                firstLetters=firstLetters+'.' + name.charAt(i+1);
            }
         if (i == 0) {;
                firstLetters = name.charAt(i)+firstLetters ;
         }
        }
        return firstLetters+lastName;
    }
}
