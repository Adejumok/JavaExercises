package chapterTen.carbonFootPrint;

public class Building implements CarbonFootprint {
    private double height;
    private String structure;

    public Building(double height, String structure) {
        this.height = height;
        this.structure = structure;
    }

    public String getStructure() {
        return structure;
    }

    public double getHeight() {
        return height;
    }

    @Override
    public double getCarbonFootprint() {
        return getHeight() * 100;
    }
}
