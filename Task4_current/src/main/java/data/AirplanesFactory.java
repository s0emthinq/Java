package data;

import entity.Airplane;
import entity.CargoPlane;
import entity.PassangerPlane;
import entity.RangeType;
import exceptions.IllegalParametersException;
import exceptions.WrongParametresNumberException;
import org.apache.log4j.Logger;
import validators.Validator;

import java.util.ArrayList;

public class AirplanesFactory {
    private static final Logger LOGGER = Logger.getLogger(AirplanesFactory.class);

    private AirplanesFactory() {
    }

    public static ArrayList<Airplane> getPlanesAsObjects(ArrayList<String> planesAsStrings)
            throws WrongParametresNumberException, IllegalParametersException {

        Validator validator = new Validator();
        ArrayList<Airplane> planesAsObjects = new ArrayList<>();
        Airplane airplane;

        String model;
        float consumption;
        float weight;
        float speed;
        float altitude;
        float loadCapacity;
        float storageVolume;
        int seats;
        RangeType rangeType = null;
        String splittedLine[];

        for (String planeAsString : planesAsStrings) {
            splittedLine = planeAsString.split(",");
            if (splittedLine.length >= 7 && splittedLine.length <= 8) {
                switch (splittedLine.length) {
                    case 7:
                        if (validator.validateCargoPlane(planeAsString)) {
                            model = splittedLine[0];
                            consumption = Float.parseFloat(splittedLine[1]);
                            weight = Float.parseFloat(splittedLine[2]);
                            speed = Float.parseFloat(splittedLine[3]);
                            altitude = Float.parseFloat(splittedLine[4]);
                            loadCapacity = Float.parseFloat(splittedLine[5]);
                            storageVolume = Float.parseFloat(splittedLine[6]);
                            airplane = new CargoPlane(model, consumption, weight, speed,
                                    altitude, loadCapacity, storageVolume);
                            planesAsObjects.add(airplane);
                            break;
                        } else {
                            String msg = "Illegal CargoPlane parameters while parsing.";
                            LOGGER.error(msg);
                            throw new IllegalParametersException(msg);
                        }

                    case 8:
                        if (validator.validatePassangerPlane(planeAsString)) {
                            model = splittedLine[0];
                            consumption = Float.parseFloat(splittedLine[1]);
                            weight = Float.parseFloat(splittedLine[2]);
                            speed = Float.parseFloat(splittedLine[3]);
                            altitude = Float.parseFloat(splittedLine[4]);
                            loadCapacity = Float.parseFloat(splittedLine[5]);
                            seats = Integer.parseInt(splittedLine[6]);
                            switch (splittedLine[7]) {
                                case "local":
                                    rangeType = RangeType.local;
                                    break;
                                case "lowRange":
                                    rangeType = RangeType.lowRange;
                                    break;
                                case "middleRange":
                                    rangeType = RangeType.middleRange;
                                    break;
                                case "highRange":
                                    rangeType = RangeType.highRange;
                                    break;
                                case "ultraHighRange":
                                    rangeType = RangeType.ultraHighRange;
                                    break;
                            }
                            airplane = new PassangerPlane
                                    (model, consumption, weight, speed, altitude, loadCapacity, seats, rangeType);
                            planesAsObjects.add(airplane);
                        } else {
                            String msg = "Illegal PassangerPlane parameters while parsing.";
                            LOGGER.error(msg);
                            throw new IllegalParametersException(msg);
                        }
                }

            } else {
                String msg = "Wrong parameters number while parsing data.";
                LOGGER.error(msg);
                throw new WrongParametresNumberException(msg);
            }
        }
        return planesAsObjects;
    }
}
