package geometrypackage;

public class Parallelogram implements Shape {
    private double height;
    private double length;

    public Parallelogram(double height, double length) {
        this.height = height;
        this.length = length;
    }

    @Override
    public double getArea() {return height * length;
    }
}
