public class Dog extends Food implements Ineeds {

    public Dog(int meat, int water) {
        super(2, 1);
        System.out.println(meat + " кг мяса" + water + " л воды");
    }

    @Override
    public void eat() {
        System.out.println("Собака ест");
    }
    @Override
    public void breathe() {
        System.out.println("Собака дышит");
    }
}
