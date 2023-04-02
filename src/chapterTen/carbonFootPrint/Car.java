package chapterTen.carbonFootPrint;

public class Car implements CarbonFootprint{
    private String model;
    private double weight;

    public Car(String model, double weight) {
        this.model = model;
        this.weight = weight;
    }

    public String getModel() {
        return model;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getCarbonFootprint() {
        return getWeight() * 60;
    }
}
