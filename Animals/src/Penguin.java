public class Penguin extends Food implements Ineeds {

    public Penguin(int zerno) {
        super(zerno);
        System.out.println(zerno + "кг зерна");
    }

    public void eat() {
        System.out.println("Пингвин ест");
    }

    @Override
    public void breathe() {
        System.out.println("Пингвин дышит");
    }
}
