public class Popugay extends Food implements Ineeds, Ifly {

    public Popugay(int zerno) {
        super(zerno);
        System.out.println(zerno + "кг зерна");
    }

    @Override
    public void fly() {
        System.out.println("Попугай летает");
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
