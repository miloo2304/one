package one;

public class One {
    private final double value; // ocena
    private final double weight; // waga

    public One(double value, double weight) {
        this.value = value;
        this.weight = weight;
    }

    public double getValue() {
        return value;
    }

    public double getWeight() {
        return weight;
    }
}
