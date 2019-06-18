package entity;

public class CargoPlane extends Airplane {
    private float storageVolume; /* Measures in m³ */

    private static final float DEFAULT_STORAGEVOLUME = 0;

    public CargoPlane() {
        super();
        storageVolume = DEFAULT_STORAGEVOLUME;
    }

    public CargoPlane(String model, float consumption, float weight, float speed, float altitude, float loadCapacity, float storageVolume) {
        super(model, consumption, weight, speed, altitude, loadCapacity);
        if (storageVolume > 0) {
            this.storageVolume = storageVolume;
        }
    }

    public float getStorageVolume() {
        return storageVolume;
    }

    public void setStorageVolume(float storageVolume) {
        if (storageVolume > 0) {
            this.storageVolume = storageVolume;
        }
    }

    @Override
    public String toString() {
        return "CargoPlane{" +
                "model='" + getModel() + '\'' +
                ", consumption=" + getConsumption() +
                ", weight=" + getWeight() +
                ", speed=" + getSpeed() +
                ", altitude=" + getAltitude() +
                ", loadCapacity=" + getLoadCapacity() +
                ", storageVolume=" + storageVolume +
                '}';
    }
}
