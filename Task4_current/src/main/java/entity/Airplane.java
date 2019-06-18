package entity;

import org.apache.log4j.Logger;

public abstract class Airplane  {

    private String model;
    private float consumption; /* Measures in tons / hour. */
    private float weight; /* Measures in tons */
    private float speed; /* Measures in km / hour. */
    private float altitude; /* Measures in km */
    private float loadCapacity; /* Measures in tons */

    private static final String DEFAULT_MODEL = "DEFAULT_MODEL";
    private static final float DEFAULT_CONSUMPTION = 0;
    private static final float DEFAULT_WEIGHT = 0;
    private static final float DEFAULT_SPEED = 0;
    private static final float DEFAULT_ALTITUDE = 0;
    private static final float DEFAULT_LOADCAPACITY = 0;


    public Airplane() {
        model = DEFAULT_MODEL;
        consumption = DEFAULT_CONSUMPTION;
        weight = DEFAULT_WEIGHT;
        speed = DEFAULT_SPEED;
        altitude = DEFAULT_ALTITUDE;
        loadCapacity = DEFAULT_LOADCAPACITY;
    }

    public Airplane(String model, float consumption, float weight, float speed, float altitude, float loadCapacity) {
            this.model = model;
            this.consumption = consumption;
            this.weight = weight;
            this.speed = speed;
            this.altitude = altitude;
            this.loadCapacity = loadCapacity;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        if (model != null) {
            this.model = model;
        }
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(float consumption) {
        if (consumption > 0) {
            this.consumption = consumption;
        }
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        if (weight > 0) {
            this.weight = weight;
        }
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        if (speed > 0) {
            this.speed = speed;
        }
    }

    public float getAltitude() {
        return altitude;
    }

    public void setAltitude(float altitude) {
        if (altitude > 0) {
            this.altitude = altitude;
        }
    }

    public float getLoadCapacity() {
        return loadCapacity;
    }

    public void setLoadCapacity(float loadCapacity) {
        if (loadCapacity > 0) {
            this.loadCapacity = loadCapacity;
        }
    }

    @Override
    public String toString() {
        return "Airplane{" +
                "model='" + model + '\'' +
                ", consumption=" + consumption +
                ", weight=" + weight +
                ", speed=" + speed +
                ", altitude=" + altitude +
                ", loadCapacity=" + loadCapacity +
                '}';
    }
}
