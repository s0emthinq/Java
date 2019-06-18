import entity.Aircompany;
import entity.Airplane;
import entity.CargoPlane;
import entity.PassangerPlane;

import logic.Logic;
import org.junit.Before;
import org.junit.Test;

import java.util.ArrayList;

import static org.junit.Assert.assertEquals;

import static entity.RangeType.middleRange;
import static entity.RangeType.ultraHighRange;

public class LogicTest {

    private ArrayList<Airplane> testAirplanes = new ArrayList<>();
    private ArrayList<Airplane> expectedFilteredAirplanes = new ArrayList<>();
    private ArrayList<Airplane> actualFilteredAirplanes = new ArrayList<>();

    Aircompany testAircompany;

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
                1130, 24.4f, 25.3f, 360, middleRange);

        testAirplanes.add(cargoPlane1);
        testAirplanes.add(cargoPlane2);
        testAirplanes.add(cargoPlane3);
        testAirplanes.add(passangerPlane1);
        testAirplanes.add(passangerPlane2);

        testAircompany = new Aircompany("BelAvia", "10.10.1980", testAirplanes);
        expectedFilteredAirplanes.add(cargoPlane1);
        expectedFilteredAirplanes.add(passangerPlane2);
    }

    @Test
    public void testCalculateLoadCapacity() {
        assertEquals(101.8, Logic.calculateLoadCapacity(testAircompany), 0.00001);
    }

    @Test
    public void testCalculateSeats() {
        assertEquals(700, Logic.calculateSeats(testAircompany));
    }

    @Test
    public void testFindByConsumptionRange() { /* Test for [6,15] consumption filter. */
        actualFilteredAirplanes = Logic.findByConsumptionRange(testAircompany,6,15);
        assertEquals(expectedFilteredAirplanes, actualFilteredAirplanes );
    }
}