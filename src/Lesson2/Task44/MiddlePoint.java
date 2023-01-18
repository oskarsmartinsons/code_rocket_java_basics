package Lesson2.Task44;

class MiddlePoint {
    private final int one, two, three;
    MiddlePoint(int one, int two, int three) {
        this.one = one;
        this.two = two;
        this.three = three;
    }
    boolean isMiddlePoint() {
        int min = Math.min(one, Math.min(two,three));
        int max = Math.max(one, Math.max(two,three));
        int leftOver = three+two+one-max-min;
        if ( (min+max)/2 !=leftOver) {return false;}
       // if ( (three-two)!=1) {return false;}
        return true;
    }
}
