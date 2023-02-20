package Diplom;

public class Specialist implements Diploma {
    @Override
    public String getID() {
        return "ID Specialist Diploma";
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
