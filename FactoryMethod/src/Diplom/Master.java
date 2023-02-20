package Diplom;

public class Master implements Diploma {
    @Override
    public String getID() {
        return "ID Master Diploma";
    }

    @Override
    public String getLastName() {
        return "Иванов";
    }

    @Override
    public String getColor() {
        return "Синий";
    }
}
