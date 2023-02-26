import Diplom.Bachelor;
import Diplom.Diploma;
import Diplom.Master;
import Diplom.Specialist;
import Gradebook.*;
import StudentIDCard.*;

public class FactoryVuz {
    private StudentIDCard studentIDCard;
    private Gradebook gradebook;
    private Diploma diploma;

    public FactoryVuz(DiplomEnum diplomEnum) {
        switch (diplomEnum) {
            case BACHELOR:
                diploma = new Bachelor();
                break;
            case SPECIALIST:
                diploma = new Specialist();
                break;
            case MASTER:
                diploma = new Master();
                break;
        }
    }

    public FactoryVuz(GradebookEnum gradebookEnum) {
        switch (gradebookEnum) {
            case EBOOK:
                gradebook = new Ebook();
                break;
            case PAPERBOOK:
                gradebook = new PaperBook();
                break;
        }
    }

    public FactoryVuz(StudentIDEnum studentIDEnum) {
        switch (studentIDEnum) {
            case EIDCARD:
                studentIDCard = new EIDCard();
                break;
            case PAPERIDCARD:
                studentIDCard = new PaperIDCard();
                break;
        }
    }

    public Diploma getDiploma() {
        return diploma;
    }

    public Gradebook getGradebook() {
        return gradebook;
    }

    public StudentIDCard getStudentIDCard() {
        return studentIDCard;
    }
}




