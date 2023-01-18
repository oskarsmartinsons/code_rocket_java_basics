package Lesson2.Task33;

class InvestmentCalculator {
    private final int years;
    private final double investment;
    private  final double rate;
    public InvestmentCalculator(int years, double investment, double rate) {
        this.years = years;
        this.investment = investment;
        this.rate = rate;
    }
    double calculateFutureInvestment(int y) {
        return investment* Math.pow(1 + rate/12/100, y * 12);
    }
    void printInvestmentGraph() {
        System.out.println("Years    FutureValue");
        for (int i = 1; i <= years; i++) {
            System.out.printf(i + "%10.2f\n", calculateFutureInvestment(i));
        }
    }
}
