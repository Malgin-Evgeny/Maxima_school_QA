package geometrypackage;

public class Auto implements Shape{

    public Auto(double _length, double _high){
        length = 0;
    }
    public Auto (double _length, double _high, double _width) {
        length = _length;
        high = _high;
    }
    @Override
    public double getArea() {
        return length * high * width;
    }
    public void setLength(double length) {
        this.length = length;
    }
    public double getLength() {
        return length;
    }
    public void setHigh(double high) {
        this.high = high;
    }
    public double getHigh() {
        return high;
    }
    private final double width = 1.8;
    private double length;
    private double high;
}
