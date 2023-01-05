public class Zhuravl extends Food implements Ineeds, Ifly {

    public Zhuravl(int zerno) {
        super(zerno);
        System.out.println(zerno + "кг зерна");
    }

    @Override
    public void fly() {
        System.out.println("Журавль летает");
    }

    @Override
    public void eat() {
        System.out.println("Журавль ест");
    }

    @Override
    public void breathe() {
        System.out.println("Журавль дышит");
    }
}
