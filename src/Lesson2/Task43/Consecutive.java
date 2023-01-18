package Lesson2.Task43;

class Consecutive {
    private final int one, two, three;
    Consecutive(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    boolean isConsecutive() {
        if ( (two-one)!=1) {return false;}
        if ( (three-two)!=1) {return false;}
        return true;
    }
}
