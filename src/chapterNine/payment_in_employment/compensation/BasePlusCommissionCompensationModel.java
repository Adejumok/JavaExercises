package chapterNine.payment_in_employment.compensation;

public class BasePlusCommissionCompensationModel extends CommissionCompensationModel {
    private double baseSalary;

    public BasePlusCommissionCompensationModel(double grossSales,
                                               double commissionRate, double baseSalary) {
        super(grossSales, commissionRate);
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }
        this.baseSalary = baseSalary;
    }

    public void setBaseSalary(double baseSalary) {
        if (baseSalary < 0.0) {
            throw new IllegalArgumentException("Base salary must be >= 0.0");
        }

        this.baseSalary = baseSalary;
    }

    public double getBaseSalary() {return baseSalary;}

    @Override
    public double earnings(){
        return baseSalary + super.earnings();

    }
}
