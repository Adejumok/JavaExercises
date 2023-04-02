package chapterThree;

public class PetrolPurchase {
    private String stationLocation;
    private String petrolType;
    private int quantityPurchasedLitre;
    private double pricePerLitre;
    private double percentageDiscount;

    public PetrolPurchase(String stationLocation, String petrolType, int quantityPurchasedLitre,
                          double pricePerLitre, double percentageDiscount) {
        this.stationLocation = stationLocation;
        this.petrolType = petrolType;
        this.quantityPurchasedLitre = quantityPurchasedLitre;
        this.pricePerLitre = pricePerLitre;
        this.percentageDiscount = percentageDiscount;
    }

    public String getStationLocation() {
        return stationLocation;
    }

    public void setStationLocation(String stationLocation) {
        this.stationLocation = stationLocation;
    }

    public String getPetrolType() {
        return petrolType;
    }

    public void setPetrolType(String petrolType) {
        this.petrolType = petrolType;
    }

    public int getQuantityPurchasedLitre() {
        return quantityPurchasedLitre;
    }

    public void setQuantityPurchasedLitre(int quantityPurchasedLitre) {
        this.quantityPurchasedLitre = quantityPurchasedLitre;
    }

    public double getPricePerLitre() {
        return pricePerLitre;
    }

    public void setPricePerLitre(double pricePerLitre) {
        this.pricePerLitre = pricePerLitre;
    }

    public double getPercentageDiscount() {
        return percentageDiscount;
    }

    public void setPercentageDiscount(double percentageDiscount) {
        this.percentageDiscount = percentageDiscount;
    }

    public double getPurchase(){
        double netPurchaseAmount= Math.round((quantityPurchasedLitre*pricePerLitre)
                -percentageDiscount);
        return netPurchaseAmount;
    }
}
