package ex19;

public class DigitalBook {
    private String title;
    private String author;
    private double fileSize; // em MB

    public DigitalBook(String title, String author, double fileSize) {
        this.title = title;
        this.author = author;
        this.fileSize = fileSize;
    }

    public void open() {
        System.out.println("Abrindo o livro " + title + " de " + author + ".");
    }

    public void close() {
        System.out.println("Fechando o livro " + title + ".");
    }
}
