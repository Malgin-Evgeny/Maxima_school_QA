package Diplom;

public class Bachelor implements Diploma {

    @Override
    public String getID() {
        return "ID Bachelor Diploma";
    }

    @Override
    public String getLastName() {
        return "Иванов";
    }

    @Override
    public String getColor() {
        return "Красный";
    }
}
