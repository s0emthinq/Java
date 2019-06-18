package logic.comparators;

import entity.Airplane;

import java.util.ArrayList;

public class SpeedThenConsumptionComparator {
    public static ArrayList<Airplane> sortBySpeedThenByConsumption(ArrayList<Airplane> airplanes) {
        SpeedComparator speedComparator = new SpeedComparator();
        ConsumptionComparator consumptionComparator = new ConsumptionComparator();
        airplanes.sort(speedComparator.thenComparing(consumptionComparator));
        return airplanes;
    }
}
