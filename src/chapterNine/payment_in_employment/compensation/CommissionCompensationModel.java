package chapterNine.payment_in_employment.compensation;

public class CommissionCompensationModel extends CompensationModel {
    private double grossSales;
    private double commissionRate;

    public CommissionCompensationModel(double grossSales, double commissionRate) {

        if (grossSales < 0.0) {
            throw new IllegalArgumentException("Gross sales must be >= 0.0");
            }

        if (commissionRate <= 0.0 || commissionRate >= 1.0) {
            throw new IllegalArgumentException(
                    "Commission rate must be > 0.0 and < 1.0");
        }
        this.grossSales = grossSales;
        this.commissionRate = commissionRate;
    }

    public void setGrossSales(double grossSales) {
         if (grossSales < 0.0) {
             throw new IllegalArgumentException("Gross sales must be >= 0.0");
             }

         this.grossSales = grossSales;
         }

        public double getGrossSales() {return grossSales;}

        public void setCommissionRate(double commissionRate) {
            if (commissionRate <= 0.0 || commissionRate >= 1.0) {
                throw new IllegalArgumentException(
                        "Commission rate must be > 0.0 and < 1.0");
            }
            this.commissionRate = commissionRate;
        }

        public double getCommissionRate() {return commissionRate;}


    @Override
    public double earnings(){
        return grossSales * commissionRate;
    }
}
