package logic.comparators;
import entity.Airplane;
import java.util.Comparator;

public class ConsumptionComparator implements Comparator<Airplane> {
    @Override
    public int compare(Airplane o1, Airplane o2) {
        if (o1.getConsumption() == o2.getConsumption()) {
            return 0;
        } else if (o1.getConsumption() < o2.getConsumption()) {
            return -1;
        } else {
            return 1;
        }
    }
}
