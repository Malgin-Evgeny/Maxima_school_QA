package StudentIDCard;

public class PaperIDCard implements StudentIDCard {
    @Override
    public void createStudentIDCard() {
        System.out.println("Создан бумажный студенческий билет");
    }
}



