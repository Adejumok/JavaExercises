package chapterNine.payment_in_employment.employee;

import chapterNine.payment_in_employment.compensation.CompensationModel;

public class Employee {
    private final String firstName;
    private final String lastName;
    private final String socialSecurityNumber;
    private CompensationModel compensationModel;

    public Employee(String firstName, String lastName, String socialSecurityNumber,
                    CompensationModel compensationModel) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialSecurityNumber = socialSecurityNumber;
        this.compensationModel = compensationModel;
    }

    public void setCompensationModel(CompensationModel compensationModel) {
        this.compensationModel = compensationModel;
    }

    public double earnings(){
        return compensationModel.earnings();
    }

    public String getFirstName() {return firstName;}


    public String getLastName() {return lastName;}


    public String getSocialSecurityNumber() {return socialSecurityNumber;}

    @Override
    public String toString() {
        return String.format("%s: %s %s%n%s: %s",
                "commission employee", firstName, lastName,
                "social security number", socialSecurityNumber);
    }

}
