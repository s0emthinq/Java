package main.airport.entity;

import java.io.Serializable;

public abstract class Airplane implements Serializable {
    private float consumption;
    private float speed;
    private float weight;

    public Airplane() {
    }

    public Airplane(float consumption, float speed, float weight) {
        this.consumption = consumption;
        this.speed = speed;
        this.weight = weight;
    }

    public float getConsumption() {
        return consumption;
    }

    public void setConsumption(float consumption) {
        this.consumption = consumption;
    }

    public float getSpeed() {
        return speed;
    }

    public void setSpeed(float speed) {
        this.speed = speed;
    }

    public float getWeight() {
        return weight;
    }

    public void setWeight(float weight) {
        this.weight = weight;
    }

}
