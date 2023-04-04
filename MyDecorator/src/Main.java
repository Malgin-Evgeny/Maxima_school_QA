public class Main {
    public static void main(String[] args) {

        Conditioner сonditionerOne = new Colls();
        System.out.println(сonditionerOne.cools());

        Conditioner сonditionerTwo = new Heating(new Colls());
        System.out.println(сonditionerTwo.cools());

        Conditioner сonditionerThree = new Filters(new Heating(new Colls()));
        System.out.println(сonditionerThree.cools());
    }
}