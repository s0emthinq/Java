package validators;

import entity.Airplane;
import org.apache.log4j.Logger;

public class Validator {
    private static final String CORRECT_FLOAT_FORMAT = "\\d+(\\.\\d+)?";
    private static final String CORRECT_STRING_FORMAT = "[a-zA-Z0-9._%+-]+";
    private static final String CORRECT_INT_FORMAT = "\\d+";
    private static final String rangeTypes[] = {"local", "lowRange", "middleRange", "highRange", "ultraHighRange"};

    public Validator() {
    }

    public boolean validateCargoPlane(String planeAsString) {
        String splittedLine[] = planeAsString.split(",");
        String model = splittedLine[0];
        String consumption = splittedLine[1];
        String weight = splittedLine[2];
        String speed = splittedLine[3];
        String altitude = splittedLine[4];
        String loadCapacity = splittedLine[5];
        String storageVolume = splittedLine[6];

        if (model.matches(CORRECT_STRING_FORMAT)
                && consumption.matches(CORRECT_FLOAT_FORMAT) && weight.matches(CORRECT_FLOAT_FORMAT)
                && speed.matches(CORRECT_FLOAT_FORMAT) && altitude.matches(CORRECT_FLOAT_FORMAT)
                && loadCapacity.matches(CORRECT_FLOAT_FORMAT) && storageVolume.matches(CORRECT_FLOAT_FORMAT)) {
            return true;
        } else {
            return false;
        }
    }

    public boolean validatePassangerPlane(String planeAsString) {
        String splittedLine[] = planeAsString.split(",");
        String model = splittedLine[0];
        String consumption = splittedLine[1];
        String weight = splittedLine[2];
        String speed = splittedLine[3];
        String altitude = splittedLine[4];
        String loadCapacity = splittedLine[5];
        String seats = splittedLine[6];
        String rangeType = splittedLine[7];
        boolean isTypeCorrect = false;

        for (String currentType :
                rangeTypes) {
            if (rangeType.equals(currentType)) {
                isTypeCorrect = true;
                break;
            }
        }

        if (model.matches(CORRECT_STRING_FORMAT)
                && consumption.matches(CORRECT_FLOAT_FORMAT) && weight.matches(CORRECT_FLOAT_FORMAT)
                && speed.matches(CORRECT_FLOAT_FORMAT) && altitude.matches(CORRECT_FLOAT_FORMAT)
                && loadCapacity.matches(CORRECT_FLOAT_FORMAT) && seats.matches(CORRECT_INT_FORMAT) && isTypeCorrect) {
            return true;
        } else {
            return false;
        }
    }
}
