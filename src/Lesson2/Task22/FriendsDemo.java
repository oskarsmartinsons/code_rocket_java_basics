package Lesson2.Task22;

class FriendsDemo {
    public static void main(String[] args) {
        Friends friends = new Friends();
        String[] friendList = friends.enterFriends();
        System.out.println("Sorted Friend List:");
        for (String f:friendList) {
            System.out.println(f);
        }
    }
}