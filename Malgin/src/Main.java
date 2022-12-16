
public class Main {
    public static void main(String[] args) {
        Harakterstiki Evgeny = new Harakterstiki("Evgeny", "Malgin", 27,
                "12.08.1995", "Driver", "Arzamas", 86.5f,
                186.2, "Высшее", "2222 222222");

        System.out.println( "Мое имя: " + Evgeny.name + "\n" + "Моя фамилия: " + Evgeny.lastname);
        System.out.println( "Дата рождения: " + Evgeny.dateofBirth + " " + "мой возраст: " + Evgeny.age);
        System.out.println( "Вес: " + Evgeny.weight + " " + "рост: " + Evgeny.height);
        System.out.println("Образование: " + Evgeny.education);
        System.out.println( "Мой паспорт: " + Evgeny.pasport + " " + "мой адрес: " + Evgeny.adress);
        System.out.println( "Я работаю: " + Evgeny.work);

    }
}
