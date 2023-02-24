import Gradebook.*;
import Diplom.*;
import StudentIDCard.*;
public class Vuz {
    //Создание Студенческого билета
    public StudentIDCard createPaperCard() {
        return new PaperIDCard();
    }
    public StudentIDCard createECard() {
        return new EIDCard();
    }

    //Создание Зачетной книжки
    public Gradebook createPaperBook() {
        return new PaperBook();
    }
    public Gradebook createEBook() {
        return new Ebook();
    }

    //Создание Дипломов
    public Diploma createBachelorD() {
        return new Bachelor();
    }
    public Diploma createSpecialistD() {
        return new Specialist();
    }
    public Diploma createMasterD() {
        return new Master();
    }
}
