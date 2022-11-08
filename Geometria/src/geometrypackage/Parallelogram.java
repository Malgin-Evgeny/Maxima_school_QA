package geometrypackage;

public class Parallelogram implements Shape{

    private Parallelogram(){
        height = 0;
        length = 0;
    }
    public Parallelogram(double height,double length){
        this.height = height;
        this.length = length;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getHeight() {
        return height;
    }

    public double getLength() {
        return length;
    }

    @Override
    public double getArea() {
        return height * length;
    }
    private double height;
    private double length;
}
