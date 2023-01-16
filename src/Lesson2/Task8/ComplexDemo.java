package Lesson2.Task8;

public class ComplexDemo {
    public static void main(String[] args) {

        // get first Complex number
        System.out.println("INPUT First complex number");
        int realFirst = Complex.inputRealPart();
        int imgFirst = Complex.inputImgPart();
        Complex firstNumber = new Complex(realFirst,imgFirst);

        // get second Complex number
        System.out.println("INPUT Second complex number");
        int realSecond = Complex.inputRealPart();
        int imgSecond = Complex.inputImgPart();
        Complex secondNumber = new Complex(realSecond,imgSecond);

        // calculate sum
        Complex sumComplex=Complex.sumComplex(firstNumber, secondNumber);
        Complex diffComplex=Complex.differenceComplex(firstNumber, secondNumber);
        Complex productComplex=Complex.productComplex(firstNumber,secondNumber);
        // print out
        Complex.printOutSum(sumComplex);
        Complex.printOutDifference(diffComplex);
        Complex.printOutProduct(productComplex);
    }
}
