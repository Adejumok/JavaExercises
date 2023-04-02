package chapterEight;

import java.text.NumberFormat;

public class SavingsAccountClients {
    public static void main(String[] args) {
        SavingsAccount savingsAccount1 = new SavingsAccount(2_000.00);
        SavingsAccount savingsAccount2 = new SavingsAccount(3_000.00);

        savingsAccount1.modifyInterestRate(4);
        savingsAccount2.modifyInterestRate(4);

        for (int monthCount = 1; monthCount <= 12; monthCount++) {
            savingsAccount1.calculateMonthlyInterest();
        }

        for (int monthCount = 1; monthCount <= 12; monthCount++) {
            savingsAccount2.calculateMonthlyInterest();
        }

        System.out.printf("The Savings Balance for the First Account after 12months is: %s",
                NumberFormat.getCurrencyInstance().format(savingsAccount1.getSavingsBalance()));

        System.out.printf("\nThe Savings Balance for the Second Account after 12months is: %s",
                NumberFormat.getCurrencyInstance().format(savingsAccount2.getSavingsBalance()));

        savingsAccount1.modifyInterestRate(5);
        savingsAccount2.modifyInterestRate(5);

        savingsAccount1.calculateMonthlyInterest();
        savingsAccount2.calculateMonthlyInterest();

        System.out.printf("\nThe Savings Balance for the First Account after " +
                        "adding next month's interest is: %s",
                NumberFormat.getCurrencyInstance().format(savingsAccount1.getSavingsBalance()));

        System.out.printf("\nThe Savings Balance for the Second Account after " +
                        "adding next month's interest is: %s",
                NumberFormat.getCurrencyInstance().format(savingsAccount2.getSavingsBalance()));
    }



}
