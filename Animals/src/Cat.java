public class Cat extends Food implements Ineeds {
    public Cat(int meat, int water) {
        super(2, 1);
        System.out.println(meat + " кг. мяса" + water + " л. воды");
    }

    @Override
    public void eat() {
        System.out.println("Кошка ест");
    }

    @Override
    public void breathe() {
        System.out.println("Кошка дышит");
    }
}
