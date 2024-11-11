package ex1;

public class MainBook {
    public static void main(String[] args) {

        Book myBook = new Book("Carta de Amor aos Mortos", "Ava Dellaria", 353);

        myBook.displayInfo();

        myBook.openBook();
        myBook.readPage();
        myBook.readPage();
        myBook.readPage();

        myBook.displayInfo();
    }
}