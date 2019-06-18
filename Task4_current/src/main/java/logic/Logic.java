package logic;

import entity.Aircompany;
import entity.Airplane;
import entity.PassangerPlane;

import java.util.ArrayList;

public class Logic {
    public static float calculateLoadCapacity(Aircompany aircompany) {
        float wholeLoadCapacity = 0;
        ArrayList<Airplane> airplanes = aircompany.getAirplanes();
        for (Airplane airplane : airplanes
        ) {
            wholeLoadCapacity += airplane.getLoadCapacity();
        }
        return wholeLoadCapacity;
    }

    public static int calculateSeats(Aircompany aircompany) {
        int allSeats = 0;
        ArrayList<Airplane> airplanes = aircompany.getAirplanes();
        for (Airplane airplane : airplanes
        ) {
            if (airplane instanceof PassangerPlane)
                allSeats += ((PassangerPlane) airplane).getSeats();
        }
        return allSeats;
    }

    public static ArrayList<Airplane> findByConsumptionRange(Aircompany aircompany, float lowerBorder, float upperBorder) {
        ArrayList<Airplane> airplanes = aircompany.getAirplanes();
        ArrayList<Airplane> filteredAirplanes = new ArrayList<>();
        for (int i = 0; i < airplanes.size(); i++) {
            if(airplanes.get(i).getConsumption() >= lowerBorder && airplanes.get(i).getConsumption() <= upperBorder) {
                filteredAirplanes.add(airplanes.get(i));
            }
        }
        return filteredAirplanes;
    }
}
