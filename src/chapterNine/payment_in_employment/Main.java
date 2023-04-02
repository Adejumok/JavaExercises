package chapterNine.payment_in_employment;

import chapterNine.payment_in_employment.compensation.BasePlusCommissionCompensationModel;
import chapterNine.payment_in_employment.compensation.CommissionCompensationModel;
import chapterNine.payment_in_employment.employee.BasePlusCommissionEmployee;
import chapterNine.payment_in_employment.employee.CommissionEmployee;
import chapterNine.payment_in_employment.employee.Employee;

public class Main {

    public static void main(String[] args) {
        CommissionCompensationModel commissionCompensationModel = new CommissionCompensationModel(3500, 0.30);
        CommissionEmployee dapoCommissionEmployee = new CommissionEmployee("Sola", "Majobaje",
                "01",commissionCompensationModel);
        System.out.println(dapoCommissionEmployee);
        System.out.println();

        BasePlusCommissionCompensationModel basePlusCommissionCompensationModel=
                new BasePlusCommissionCompensationModel(4000,0.20,400);
        BasePlusCommissionEmployee jideBasePlusCommissionEmployee=
                new BasePlusCommissionEmployee("Jide", "Kofoworola",
                        "02", basePlusCommissionCompensationModel);
        System.out.println(jideBasePlusCommissionEmployee);
        System.out.println();

        Employee kike = new CommissionEmployee("Kike", "Igwe",
                "12",commissionCompensationModel);
        System.out.println(kike);
        System.out.println();

        Employee john = new BasePlusCommissionEmployee("John", "Ahmed",
                "11", basePlusCommissionCompensationModel);
        System.out.println(john);
        System.out.println();
    }
}
