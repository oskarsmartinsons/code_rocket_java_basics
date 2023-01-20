package Lesson3.Task30_31;

class IntegerChecker {
    private final int first, second, third;
    public IntegerChecker(int first, int second, int third) {
        this.first = first;
        this.second = second;
        this.third = third;
    }
    void checkDifference(){
        if(first == second && second==third){
            System.out.println("All numbers are equal");
        } else if(first!=second && second!=third && first !=third) {
            System.out.println("All numbers are different");
        } else {
            System.out.println("Neither all are equal or different");
        }
    }
    void checkOrder(){
        if(first > second && second > third){
            System.out.println("Decreasing order");
        } else if(first < second && second < third ) {
            System.out.println("Increasing order");
        } else {
            System.out.println("Neither increasing or decreasing order");
        }
    }

}