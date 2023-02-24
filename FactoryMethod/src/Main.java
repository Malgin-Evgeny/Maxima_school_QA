import Gradebook.*;
import Diplom.*;
import StudentIDCard.*;

public class Main {
    public static void main(String[] args) {

        Vuz idCard = new Vuz();
        StudentIDCard card01 = idCard.createECard();
        StudentIDCard card02 = idCard.createPaperCard();
        StudentIDCard card03 = idCard.createPaperCard();

        Vuz gradebook = new Vuz();
        Gradebook book01 = gradebook.createPaperBook();
        Gradebook book02 = gradebook.createEBook();
        Gradebook book03 = gradebook.createPaperBook();

        Vuz diploms = new Vuz();
        Diploma diploma01 = diploms.createBachelorD();
        Diploma diploma02 = diploms.createSpecialistD();
        Diploma diploma03 = diploms.createMasterD();
    }
}

