package StudentIDCard;

public class EIDCard implements StudentIDCard{

    @Override
    public String getID() {
        return "ID ECard";
    }

    @Override
    public String getLastName() {
        return "иванов";
    }
}

