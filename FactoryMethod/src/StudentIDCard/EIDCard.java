package StudentIDCard;

public class EIDCard implements StudentIDCard {
    @Override
    public void createStudentIDCard() {
        System.out.println("Создан электронный студенческий билет");
    }
}

