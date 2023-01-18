package Lesson2.Task43;

class ConsecutiveDemo {
    public static void main(String[] args) {
        int[] integers = UserInput.inputIntegers();
        Consecutive consecutive = new Consecutive(integers[0],integers[1],integers[2]);
        boolean isConsecutive = consecutive.isConsecutive();
        System.out.println("Check whether the three said numbers are consecutive or not!"+isConsecutive);
    }
}
