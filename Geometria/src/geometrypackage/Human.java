package geometrypackage;

public class Human implements Shape {
    private final double CONST = 0.007184;
    private double growth;
    private double weight;

    public Human(double growth, double weight) {
        this.growth = growth;
        this.weight = weight;
    }

    @Override
    public double getArea() {
        return CONST * Math.pow(growth, 0.425) * Math.pow(weight, 0.725);
    }
}
