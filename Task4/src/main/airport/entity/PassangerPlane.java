package main.airport.entity;

import java.io.Serializable;

public class PassangerPlane extends Airplane implements Serializable {
    private String model;
    private int capacity;
    private RangeType rangeType;

    public enum RangeType {
        local,
        lowRange,
        middleRange,
        highRange,
        ultraHighRange
    }

    public PassangerPlane() {
    }

    public PassangerPlane(float consumption, float speed, float weight, String model, int capacity, RangeType rangeType) {
        super(consumption, speed, weight);
        this.model = model;
        this.capacity = capacity;
        this.rangeType = rangeType;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public int getCapacity() {
        return capacity;
    }

    public void setCapacity(int capacity) {
        this.capacity = capacity;
    }

    public RangeType getRangeType() {
        return rangeType;
    }

    public void setRangeType(RangeType rangeType) {
        this.rangeType = rangeType;
    }

    @Override
    public String toString() {
        return getConsumption() +
                "," + getSpeed() +
                "," + getWeight() +
                "," + model +
                "," + capacity +
                "," + rangeType;
    }
}
