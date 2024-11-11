package ex19;

public class DigitalMain {
    public static void main(String[] args) {
        DigitalBook digitalBook = new DigitalBook("Carta de Amor aos Mortos", "Ava Dellaira", 3.7);
        digitalBook.open();
        digitalBook.close();
    }
}
