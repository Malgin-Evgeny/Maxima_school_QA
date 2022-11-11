public class Main {
    public static void main(String[] args) {
        Dog dog = new Dog(2,1);
        dog.eat();
        dog.breathe();
        Cat cat = new Cat();
        cat.eat();
        cat.breathe();
        Penguin penguin = new Penguin(2);
        penguin.eat();
        penguin.breathe();
        Popugay popugay = new Popugay();
        popugay.eat();
        popugay.breathe();
        popugay.fly();
        Zhuravl zhuravl = new Zhuravl();
        zhuravl.eat();
        zhuravl.breathe();
        zhuravl.fly();
        String food = zhuravl.givegrain();
        System.out.println(food);

    }
}