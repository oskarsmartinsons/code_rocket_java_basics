package Lesson2.Task22;

import java.util.Arrays;
import java.util.Scanner;

class Friends {
    String[] enterFriends() {
        String friends[] = new String[10];
        for (int i = 0; i < 10; i++) {
            Scanner input = new Scanner(System.in);
            System.out.println("Enter friend Nr: "+(i+1));
            String name = input.nextLine();
            friends[i] = name;
        }
        Arrays.sort(friends);
        return friends ;
    }
}