import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Список студентов:");
        System.out.println("1. Иванов");
        System.out.println("2. Петров");
        System.out.println("3. Сидоров");
        String lastname;
        do {
            Scanner sc = new Scanner(System.in);
            System.out.println("Введите фамилию нужного студента: ");
            lastname = sc.nextLine();
            switch (lastname) {
                case "Иванов":
                    System.out.println("Иванов Иван Иванович");
                    break;
                case "Петров":
                    System.out.println("Петров Петр Петрович");
                    break;
                case "Сидоров":
                    System.out.println("Сидоров Сидр Сидорович");
                    break;
                default:
                    System.out.println("Студентов с такими фамилиями нет ");
                    break;
            }
        } while (!lastname.equals("Иванов") && !lastname.equals("Петров") && !lastname.equals("Сидоров"));
    }
}