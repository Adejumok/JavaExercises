package chapterEight;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class SavingsAccount {
    private static BigDecimal annualInterestRate;
    private BigDecimal savingsBalance;

    public SavingsAccount(double savingsBalance) {
        this.savingsBalance = BigDecimal.valueOf(savingsBalance);
    }

    public void calculateMonthlyInterest(){
        BigDecimal MI = (savingsBalance.multiply(annualInterestRate).divide(BigDecimal.valueOf(12), RoundingMode.CEILING));
        savingsBalance = savingsBalance.add(MI);
    }

    public BigDecimal getSavingsBalance() {
        return savingsBalance;
    }

    public void modifyInterestRate(double newAnnualInterestRate){
        annualInterestRate= BigDecimal.valueOf(newAnnualInterestRate);
    }
}
