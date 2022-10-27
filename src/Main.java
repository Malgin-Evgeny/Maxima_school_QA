
public class Main {
    public static void main(String[] args) {
        harakterstiki Evgeny = new harakterstiki();
        Evgeny.name = "Evgeny";
        Evgeny.lastname = "Malgin";
        Evgeny.dateofBirth = "12.08.1995";
        Evgeny.age = 27;
        Evgeny.weight = 87.5f;
        Evgeny.height = 186.2;
        Evgeny.pasport = "2222 222222";
        Evgeny.adress = "Arzamas";
        Evgeny.work = "Driver";
        System.out.println( "Мое имя " + Evgeny.name + "\n" + "Моя фамилия " + Evgeny.lastname);
        System.out.println( "Дата рождения " + Evgeny.dateofBirth + " " + "мой возраст " + Evgeny.age);
        System.out.println( "вес " + Evgeny.weight + " " + "рост " + Evgeny.height);
        System.out.println( "Мой паспорт " + Evgeny.pasport + " " + "мой адрес " + Evgeny.adress);
        System.out.println( "Я работаю " + Evgeny.work);

    }
}
