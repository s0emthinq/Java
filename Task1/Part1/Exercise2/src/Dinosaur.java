public class Dinosaur {
    private double weight;

    public Dinosaur() {
    }

    public Dinosaur(double weight) {
        this.weight = weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public double getWeight() {
        return weight;
    }

    public double toMilligrams(double kg) {
        return kg * 1_000_000;
    }

    public double toGrams(double kg) {
        return kg * 1000;
    }

    public double toTons(double kg) {
        return kg / 1000;
    }
}
