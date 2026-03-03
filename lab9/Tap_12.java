public class Tap_12 {

    static class Bank {

        static double interestRate = 0.1;

        static double calculate(double money) {
            return money * interestRate;
        }
    }

    public static void main(String[] args) {

        double result = Bank.calculate(1000);

        System.out.println("Interest: " + result);
    }
}