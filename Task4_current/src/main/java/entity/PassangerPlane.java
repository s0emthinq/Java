package entity;

public class PassangerPlane extends Airplane {
    private int seats;
    private RangeType rangeType;
    private static final int DEFAULT_SEATS = 0;
    private static final RangeType DEFAULT_RANGETYPE = RangeType.local;

    PassangerPlane() {
        super();
        seats = DEFAULT_SEATS;
        rangeType = DEFAULT_RANGETYPE;
    }

    public PassangerPlane(String model, float consumption, float weight, float speed,
                          float altitude, float loadCapacity, int seats, RangeType rangeType) {
        super(model, consumption, weight, speed, altitude, loadCapacity);
        if (seats > 0 && rangeType != null) {
            this.seats = seats;
            this.rangeType = rangeType;
        }
    }

    public int getSeats() {
        return seats;
    }

    public void setSeats(int seats) {
        if (seats > 0) {
            this.seats = seats;
        }
    }

    public RangeType getRangeType() {
        return rangeType;
    }

    public void setRangeType(RangeType rangeType) {
        if (rangeType != null) {
            this.rangeType = rangeType;
        }
    }

    @Override
    public String toString() {
        return "PassangerPlane{" +
                "model='" + getModel() + '\'' +
                ", consumption=" + getConsumption() +
                ", weight=" + getWeight() +
                ", speed=" + getSpeed() +
                ", altitude=" + getAltitude() +
                ", loadCapacity=" + getLoadCapacity() +
                ", seats=" + seats +
                ", rangeType=" + rangeType +
                '}';
    }
}
