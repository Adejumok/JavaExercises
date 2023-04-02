package chapterNine.payment_in_employment.employee;

import chapterNine.payment_in_employment.compensation.CommissionCompensationModel;
import chapterNine.payment_in_employment.compensation.CompensationModel;

public class CommissionEmployee extends Employee{
    private static CompensationModel compensationModel;
    private CommissionCompensationModel commissionCompensationModel;

    public CommissionEmployee(String firstName, String lastName,
                              String socialSecurityNumber, CommissionCompensationModel commissionCompensationModel) {
        super(firstName, lastName, socialSecurityNumber, compensationModel);

         this.commissionCompensationModel=commissionCompensationModel;
         }


        public double earnings() {return commissionCompensationModel.earnings();}

        @Override
        public String toString() {
            return String.format("%s%n%s: #%.2f",super.toString(),
                    "earning", earnings());
        }
}
