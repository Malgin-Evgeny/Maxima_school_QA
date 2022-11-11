public class Popugay implements Ineeds,Ifly{

    public Popugay(){}
    @Override
    public void fly() {
        System.out.println("Попугай летает");
    }

    @Override
    public String givegrain() {
        return null;
    }

    @Override
    public void eat() {
        System.out.println("Попугай ест");
    }

    @Override
    public void breathe() {
        System.out.println("Попугай дышит");
    }
}
