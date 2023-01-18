package Lesson2.Task34;

class InvestmentCalculator {
    private final int years;
    private final double investment;
    private  final double rate;

    public int getYears() {
        return years;
    }
    public double getInvestment() {
        return investment;
    }
    public double getRate() {
        return rate;
    }
    public InvestmentCalculator(int years, double investment, double rate) {
        this.years = years;
        this.investment = investment;
        this.rate = rate;
    }
/*    double calculateFutureInvestment(double investment, double monthlyRate, int years) {
        return investment* Math.pow(1 + monthlyRate, years * 12);
    }*/
    double calculateFutureInvestment(int y) {
        return investment* Math.pow(1 + rate/12/100, y * 12);
    }

    void printInvestmentGraph() {
        System.out.println("Years    FutureValue");
        for (int i = 1; i <= years; i++) {
            System.out.printf(i + "%10.2f\n", calculateFutureInvestment(i));
          //  int formatter = 19;
        //    if (i >= 10) formatter = 18;
        //    System.out.printf(i + "%" + formatter + ".2f\n", futureInvestmentValue(investment, rate / 12, i));
        }

    }
}
