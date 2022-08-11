public class Main {
    public static void main(String[] args) {
        CreditPaymentService calculator = new CreditPaymentService();
        double credit = 1_000_000;
        double interestRate = 9.99;
        double credit12Months = 12;
        double credit1 = calculator.calculate(credit, interestRate, credit12Months);
        System.out.println("Ежемесячный платеж " + credit1);
        double credit24Months = 24;
        double credit2 = calculator.calculate(credit, interestRate, credit24Months);
        System.out.println("Ежемесячный платеж " + credit2);
        double credit36Months = 36;
        double credit3 = calculator.calculate(credit, interestRate, credit36Months);
        System.out.println("Ежемесячный платеж " + credit3);

    }
}