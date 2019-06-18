package logic.comparators;
import entity.Airplane;
import java.util.Comparator;

public class SpeedComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane o1, Airplane o2) {
        if (o1.getSpeed() == o2.getSpeed()) {
            return 0;
        } else if (o1.getSpeed() < o2.getSpeed()) {
            return -1;
        } else {
            return 1;
        }
    }
}
