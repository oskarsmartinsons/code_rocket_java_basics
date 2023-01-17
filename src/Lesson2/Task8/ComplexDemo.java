package Lesson2.Task8;

public class ComplexDemo {
    public static void main(String[] args) {
        // get first Complex number
        System.out.println("INPUT First complex number");
        int realFirst = UserInput.inputRealPart();
        int imgFirst = UserInput.inputImgPart();
        Complex firstNumber = new Complex(realFirst, imgFirst);

        // get second Complex number
        System.out.println("INPUT Second complex number");
        int realSecond = UserInput.inputRealPart();
        int imgSecond = UserInput.inputImgPart();
        Complex secondNumber = new Complex(realSecond, imgSecond);

        // calculate sum
        Complex sumComplex = firstNumber.sumComplex(secondNumber);
        Complex diffComplex = firstNumber.differenceComplex(secondNumber);
        Complex productComplex = firstNumber.productComplex(secondNumber);
        // print out
        sumComplex.printOutSum();
        diffComplex.printOutDifference();
        productComplex.printOutProduct();
    }
}