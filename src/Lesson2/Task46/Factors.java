package Lesson2.Task46;

class Factors {
    void displayFactors(int myInteger) {
        int result = myInteger ;
        System.out.print(myInteger+" = ");
        while(result%3==0){
            System.out.print("3 * ");
            result=result/3;
        }
        System.out.print(result);
    }
}
