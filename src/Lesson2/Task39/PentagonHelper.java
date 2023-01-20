package Lesson2.Task39;

class PentagonHelper {
    private final int sideCount;
    private final double sideLength;
    public PentagonHelper(int sideCount, double sideLength) {
        this.sideCount = sideCount;
        this.sideLength= sideLength;
    }
    double calculateArea () {
        return  (sideCount* sideLength * sideLength) / (4 * Math.tan(Math.PI/sideCount));
    }
}
