package StudentIDCard;

public class PaperIDCard implements StudentIDCard {

    @Override
    public String getID() {
        return "ID paperCard";
    }

    @Override
    public String getLastName() {
        return "иванов";
    }
}

