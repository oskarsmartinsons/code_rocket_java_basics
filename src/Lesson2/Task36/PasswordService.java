package Lesson2.Task36;

import static java.lang.Character.*;

class PasswordService {
    boolean isValidPassword (String password) {
        int ctrChar = 0;
        int ctrDigits = 0;
        for (int i = 0; i < password.length(); i++) {
            char myChar=password.charAt(i);
            if ((isDigit(myChar)) || (isAlphabetic(myChar))) {
                if(isDigit(myChar)) {ctrDigits++;}
                if(isAlphabetic(myChar)) {ctrChar++;}
            } else {
                return false;
            }
        }
        if (ctrDigits<=2) {return false;}
        if (ctrChar<=10){return false;}
        return true;
    }
    String printResult (boolean isValid) {
        if(isValid) {
            return "Password is valid:";
        } else {
            return "Password is invalid:";
        }
    }
}
