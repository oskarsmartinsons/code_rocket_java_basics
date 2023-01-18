package Lesson2.Task48;

class VowelExpert {
    boolean isAllVowels (String myString) {

        for (int i = 0; i < myString.length(); i++) {
        //    if(Character.getNumericValue(myString.charAt(i))%2!=0) {return false;}
            char myChar =  myString.charAt(i);
            if (myChar != 'a' && myChar != 'e' && myChar != 'i' && myChar != 'o' && myChar != 'u' && myChar != 'A' &&
                    myChar != 'E' && myChar != 'I' && myChar != 'O' && myChar != 'U') {return false;}
        }
        return true;
    }
}
