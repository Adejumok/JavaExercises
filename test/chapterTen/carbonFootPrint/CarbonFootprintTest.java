package chapterTen.carbonFootPrint;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.ArrayList;

import static org.junit.jupiter.api.Assertions.*;

class CarbonFootprintTest {
    private Building building;
    private Bicycle bicycle;
    private Car car;
    private CarbonFootprint carbonFootprint;
    private ArrayList<CarbonFootprint> carbonFootprints;

    @BeforeEach
    void setUp() {
       building=new Building(65.0,"Straight");
       bicycle=new Bicycle(2,45);
       car=new Car("porch '19", 76);
    }

    @Test
    public void methodTest(){
        carbonFootprints.set(0, building);
        carbonFootprints.set(1, bicycle);
        carbonFootprints.set(2, car);

        for (int i = 0; i < carbonFootprints.size(); i++) {
            carbonFootprint.getCarbonFootprint();
        }

        assertEquals(4560.0,car.getCarbonFootprint());
    }
}