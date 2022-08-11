public class CreditPaymentService {
    public double calculate(double credit, double interestRate, double credit12Months) {
        double YearPerMonth = 12;
        double yearPercent = interestRate / 100 / YearPerMonth;
        double monthPercent = 1 + yearPercent;
        double monthPay = credit * (yearPercent * (Math.pow(monthPercent, credit12Months) / (Math.pow(monthPercent, credit12Months) - 1)));
        return monthPay;
    }
}