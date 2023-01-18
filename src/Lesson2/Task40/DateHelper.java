package Lesson2.Task40;

import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

class DateHelper {
    void displayDate(){
        DateTimeFormatter dtf = DateTimeFormatter.ofPattern("EEEE MMMM dd, yyyy HH:mm:ss");
        LocalDateTime now = LocalDateTime.now();
        System.out.println(dtf.format(now));
    }
}
