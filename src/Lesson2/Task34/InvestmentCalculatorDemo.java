package Lesson2.Task34;

public class InvestmentCalculatorDemo {
    public static void main(String[] args) {
        int years = UserInput.inputYears();
        double investment = UserInput.inputInvestment();
        double rate = UserInput.inputROI();
        InvestmentCalculator investmentCalculator = new InvestmentCalculator(years, investment, rate);
      //  investmentCalculator.calculateFutureInvestment();
        investmentCalculator.printInvestmentGraph();
    }
}
