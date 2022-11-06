package geometrypackage;

public class Rhombus implements Shape{

    public Rhombus(){
        length = 0;
    }
    public Rhombus(double _length, double _high){
        length = _length;
        high = _high;
    }
    @Override
    public double getArea() {
        return length * high;
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
    private double length;
    private double high;
}