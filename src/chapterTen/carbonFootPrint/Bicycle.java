package chapterTen.carbonFootPrint;

public class Bicycle implements CarbonFootprint{
    private int pedals;
    private double weight;

    public Bicycle(int pedals, double weight) {
        this.pedals = pedals;
        this.weight = weight;
    }

    public int getPedals() {
        return pedals;
    }

    public double getWeight() {
        return weight;
    }

    @Override
    public double getCarbonFootprint() {
        return getPedals() * getWeight();
    }
}
