package geometrypackage;

public class Sqare implements Shape {
    private double length;

    public Sqare(double _length) {
        length = _length;
    }

    @Override
    public double getArea() {
        return length * length;
    }
}

