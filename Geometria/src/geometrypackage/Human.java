package geometrypackage;

public class Human implements Shape{

    public Human(){
        growth = 0;
        weight = 0;
    }
    public Human (double growth, double weight) {
        this.growth = growth;
        this.weight = weight;
    }
    @Override
    public double getArea() {return Const * Math.pow(growth, 0.425) * Math.pow(weight, 0.725);}
    public void setGrowth(double growth) {
        this.growth = growth;
    }
    public double getGrowth() {
        return growth;
    }
    public void setWeight(double weight) {
        this.weight = weight;
    }
    public double getWeight() {
        return weight;
    }


    private final double Const = 0.007184;
    private double growth;
    private double weight;
}
