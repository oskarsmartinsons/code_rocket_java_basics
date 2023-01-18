package Lesson2.Task39;

class PentagonHelperDemo {
    public static void main(String[] args) {
        PentagonHelper pentagonHelper = new PentagonHelper(UserInput.inputSideCount(),UserInput.inputSideLength());
        double area = pentagonHelper.calculateArea();
        System.out.println("The area of the pentagon is " + area);
    }
}
