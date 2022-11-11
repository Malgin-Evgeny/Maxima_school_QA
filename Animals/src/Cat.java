public class Cat implements Ineeds{

    public Cat(){}
    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void breathe() {
        System.out.println("Кошка дышит");
    }
}
