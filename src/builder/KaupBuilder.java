package builder;

public class KaupBuilder {
    private double height;
    private double weight;

    public KaupBuilder height(double height) {
        this.height = height;
        return this;
    }
    public KaupBuilder weight(double weight) {
        this.weight = weight;
        return this;
    }
    public double build() {
        return weight / (height * height);
    }
}
