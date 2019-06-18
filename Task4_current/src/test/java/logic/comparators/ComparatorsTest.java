package logic.comparators;

import entity.Airplane;
import entity.CargoPlane;
import entity.PassangerPlane;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

import java.util.ArrayList;

import static entity.RangeType.*;

public class ComparatorsTest {

    private ArrayList<Airplane> testAirplanes = new ArrayList<>();
    private ArrayList<Airplane> expectedBySpeed = new ArrayList<>();
    private ArrayList<Airplane> expectedByConsumption = new ArrayList<>();
    private ArrayList<Airplane> expectedBySpeedThenConsumption = new ArrayList<>();

    @Before
    public void fillInValues() {
        CargoPlane cargoPlane1 = new CargoPlane("AH14", 6, 7, 480,
                3.1f, 30.6f, 150);
        CargoPlane cargoPlane2 = new CargoPlane("AH12", 3.1f, 90, 240,
                6.2f, 15.3f, 75);
        CargoPlane cargoPlane3 = new CargoPlane("AH13", 3.3f, 90, 240,
                6.2f, 15.3f, 75);
        PassangerPlane passangerPlane1 = new PassangerPlane("Boeing-747", 24, 15,
                960, 12.4f, 15.3f, 340, ultraHighRange);
        PassangerPlane passangerPlane2 = new PassangerPlane("Boeing-777", 12, 30,
                1130, 24.4f, 25.3f, 340, middleRange);

        testAirplanes.add(cargoPlane1);
        testAirplanes.add(cargoPlane2);
        testAirplanes.add(cargoPlane3);
        testAirplanes.add(passangerPlane1);
        testAirplanes.add(passangerPlane2);

        expectedBySpeed.add(cargoPlane2);
        expectedBySpeed.add(cargoPlane3);
        expectedBySpeed.add(cargoPlane1);
        expectedBySpeed.add(passangerPlane1);
        expectedBySpeed.add(passangerPlane2);

        expectedByConsumption.add(cargoPlane2);
        expectedByConsumption.add(cargoPlane3);
        expectedByConsumption.add(cargoPlane1);
        expectedByConsumption.add(passangerPlane2);
        expectedByConsumption.add(passangerPlane1);

        expectedBySpeedThenConsumption.add(cargoPlane2);
        expectedBySpeedThenConsumption.add(cargoPlane3);
        expectedBySpeedThenConsumption.add(cargoPlane1);
        expectedBySpeedThenConsumption.add(passangerPlane1);
        expectedBySpeedThenConsumption.add(passangerPlane2);

    }

    @Test
    public void testSortBySpeed() {
        testAirplanes.sort(new SpeedComparator());
        assertEquals(expectedBySpeed, testAirplanes);
    }

    @Test
    public void testSortByConsumption() {
        testAirplanes.sort(new ConsumptionComparator());
        assertEquals(expectedByConsumption, testAirplanes);
    }

    @Test
    public void testSortBySpeedThenConsumption() {
        SpeedThenConsumptionComparator.sortBySpeedThenByConsumption(testAirplanes);
        assertEquals(expectedBySpeedThenConsumption, testAirplanes);
    }
}
