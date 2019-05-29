package main.airport.logic;

import main.airport.entity.CargoPlane;
import main.airport.entity.PassangerPlane;

import java.util.ArrayList;

public class Logic {
    public int getAllCapacity(ArrayList<PassangerPlane> passangerPlanes)
    {
        int wholeCapacity = 0;
        for (PassangerPlane currPlane :
                passangerPlanes) {
         wholeCapacity += currPlane.getCapacity();
        }
        return wholeCapacity;
    }

    public float getAllLoadCapacity(ArrayList<CargoPlane> cargoPlanes)
    {
        float wholeLoadCapacity = 0;
        for (CargoPlane currPlane :
                cargoPlanes) {
            wholeLoadCapacity += currPlane.getLoadCapacity();
        }
        return wholeLoadCapacity;
    }


}
