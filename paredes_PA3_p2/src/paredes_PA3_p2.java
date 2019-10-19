
import java.util.Scanner;
import java.security.SecureRandom;

public class paredes_PA3_p2 {

    public static void main(String[] args) {

        class SavingsAccount {

            private double savingsBalance;
            private double annualInterestRate;
            private double monthlyInterest;

            public void setSavingsBalance(double newBalance) {
                savingsBalance = newBalance;
            }

            public void calculateMonthlyInterest() {
                monthlyInterest = (annualInterestRate * savingsBalance) / 12.0;
                savingsBalance += monthlyInterest;
            }

            public void modifyInterestRate(double rate) {
                annualInterestRate = rate;
            }

            public void print() {
                System.out.printf("Savings Balance: %.2f\n",savingsBalance);
            }
        }

        double rate = 0.04;

        SavingsAccount saver1 = new SavingsAccount();
        SavingsAccount saver2 = new SavingsAccount();

        saver1.setSavingsBalance(2000.00);
        saver2.setSavingsBalance(3000.00);

        saver1.modifyInterestRate(rate);
        saver2.modifyInterestRate(rate);

        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        saver1.print();
        saver2.print();

        rate = 0.05;

        saver1.modifyInterestRate(rate);
        saver2.modifyInterestRate(rate);

        for (int i = 0; i < 12; i++) {
            saver1.calculateMonthlyInterest();
            saver2.calculateMonthlyInterest();
        }

        System.out.println("");
        saver1.print();
        saver2.print();

    }

}
