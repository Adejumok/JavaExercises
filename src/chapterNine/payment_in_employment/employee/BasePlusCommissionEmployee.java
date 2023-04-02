package chapterNine.payment_in_employment.employee;

import chapterNine.payment_in_employment.compensation.BasePlusCommissionCompensationModel;
import chapterNine.payment_in_employment.compensation.CommissionCompensationModel;

public class BasePlusCommissionEmployee extends CommissionEmployee{
    private BasePlusCommissionCompensationModel basePlusCompensation;
    private static CommissionCompensationModel commissionCompensationModel;

    public BasePlusCommissionEmployee(String firstName, String lastName,
                String socialSecurityNumber, BasePlusCommissionCompensationModel basePlusCompensation) {

        super(firstName, lastName,
                socialSecurityNumber, commissionCompensationModel);

        this.basePlusCompensation=basePlusCompensation;
    }

    @Override
    public double earnings() {
        return basePlusCompensation.earnings();
         }

    @Override
    public String toString(){
        return String.format("%s",super.toString());
    }
}
