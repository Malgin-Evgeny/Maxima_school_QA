package beersong;

public class BeerSong {
    public static void main(String[] args) {
        int beerNum = 99;
        String word;
        while (beerNum > 0) {
            if (beerNum == 1) {
                word = "бутылка";
            } else if (beerNum % 10 == 2 || beerNum % 10 == 3 || beerNum % 10 == 4) {
                word = "бутылки";
            } else {
                word = "бутылок";
            }
            System.out.println(beerNum + " " + word + " пива на столе");
            System.out.println(beerNum + " " + word + " пива.");
            System.out.println("Возьму одну.");
            System.out.println("Пусти по кругу.");
            beerNum = beerNum - 1;
            if (beerNum > 0) {
                System.out.println(beerNum + " " + word + " пива на столе");
            } else {
                System.out.println("Нет бутылок пива на столе");
            }

            System.out.println(); // пустая строка
        }
    }
}
