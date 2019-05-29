package main.airport.entity;

import java.io.Serializable;

public class CargoPlane extends Airplane implements Serializable {
    private String model;
    private float loadCapacity;
    private float storageVolume;

    public CargoPlane() {
        super();
    }

    public CargoPlane(float consumption, float speed, float weight, String model, float loadCapacity, float storageVolume) {
        super(consumption, speed, weight);
        this.model = model;
        this.loadCapacity = loadCapacity;
        this.storageVolume = storageVolume;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        this.loadCapacity = loadCapacity;
    }

    public float getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(float storageVolume) {
        this.storageVolume = storageVolume;
    }

    @Override
    public String toString() {
        return getConsumption() +
                "," + getSpeed() +
                "," + getWeight() +
                "," + model +
                "," + loadCapacity +
                "," + storageVolume;
    }
}
