package geometrypackage;

public class Cicle implements Shape {
    static final double PI = 3.14;
    private double radius;

    public Cicle(double _radius) {
        radius = _radius;
    }

    @Override
    public double getArea() {
        return PI * Math.pow(radius, 2);
    }

}


