package geometrypackage;

public class Rectangle implements Shape {
    private double length;
    private double high;

    public Rectangle(double _length, double _high) {
        length = _length;
        high = _high;
    }

    @Override
    public double getArea() {
        return length * high;
    }



}
