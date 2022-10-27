import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        String myString = "Вывод любых строк"; // 1

        String firstString= "Объединение ";  // 2
        String secondString = "двух строк";
        String sumOfTwoStrings = firstString + secondString;

        String qliti = "This is my string, there are many like it but this one"; // 3

        String myS = "This is my string, there are many like it but this one is mine"; // 4

        String mySt = "This is my string, there are many like it but this one is mine"; // 5

        String myStr = "This is my string, there are many like it but this one is mine"; // 6
        String anotherStrin = "This one is not the same";
        boolean areEqual = myStr.equals(anotherStrin);

        String myStrin = "This is my string, there are many like it but this one is mine"; // 7
        String newString = myStrin.concat(". The end");

        String homeStreet = "New Str."; // 8
        int houseNr = 34;
        int flatNr = 1;
        String myAddress = String.format("I live at %s, house %d, flat %d", homeStreet, houseNr, flatNr);

        String замена = "This is my string, there are many like it but this one is mine"; // 9
        String заменитьна = замена.replace('i', 'a');
        String newerString = заменитьна.replace("re", "");

        Scanner sc = new Scanner(System.in);
        System.out.println("Введите любое число от 1 до 9: ");
        int Loc = sc.nextInt();
        if(Loc == 1) {
            System.out.println (myString);
        }
        if  (Loc == 2){
            System.out.println (sumOfTwoStrings);
        }
        if  (Loc == 3){
            System.out.println ("Колличество символов в строке равно " + qliti.length());
        }
        if  (Loc == 4){
            System.out.println ("Если строка пустая false, если нет то true " + myS.isEmpty());
        }
        if  (Loc == 5){
            System.out.println ("Символ строки по индексу 19 = " + mySt.charAt(19));
        }
        if  (Loc == 6){
            System.out.println ("Возвращает true, если строки одинаковые, false - если нет " + areEqual);
        }
        if  (Loc == 7){
            System.out.println ("Возвращает результирующую строку, состоящую из первоначальной, с добавлением в ее конец новой\n"
                    + newString );
        }
        if  (Loc == 8){
            System.out.println ("Мой адрес " + myAddress);
        }
        if  (Loc == 9){
            System.out.println ("Замена символов " + newerString);
        }
        else if (Loc >9) {
            System.out.println("Ошибка. Введите цифры от 1 до 9");
        }

    }
}