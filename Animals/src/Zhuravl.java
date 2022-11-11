public class Zhuravl extends Food implements Ineeds,Ifly {


    public Zhuravl(){}
    @Override
    public void fly() {
        System.out.println("Журавль летает");
    }

    @Override
    public String givegrain() {
        String food = "Дать зерно";
        return food;
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
