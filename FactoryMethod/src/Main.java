public class Main {

    public static void main(String[] args) {
        FactoryVuz diploma = new FactoryVuz(DiplomEnum.MASTER);
        diploma.getDiploma().createDiplom();

        FactoryVuz gradebook = new FactoryVuz(GradebookEnum.PAPERBOOK);
        gradebook.getGradebook().createGradebook();

        FactoryVuz studentIdCard = new FactoryVuz(StudentIDEnum.EIDCARD);
        studentIdCard.getStudentIDCard().createStudentIDCard();
    }
}

