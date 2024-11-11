package ex1;

public class Book {

    String title;
    String author;
    int numberOfPages;
    int currentPage;

    public Book(String title, String author, int numberOfPages) {
        this.title = title;
        this.author = author;
        this.numberOfPages = numberOfPages;
        this.currentPage = 0;
    }

    public void openBook() {
        this.currentPage = 1;
        System.out.println("O livro \"" + title + "\" foi aberto na pagina " + currentPage + ".");
    }

    public void readPage() {
        if (currentPage < numberOfPages) {
            currentPage++;
            System.out.println("Lendo pagina " + currentPage + " de \"" + title + "\".");
        } else {
            System.out.println("Voce ja leu todas as paginas do livro \"" + title + "\".");
        }
    }
    public void displayInfo() {
        System.out.println("Titulo: " + title);
        System.out.println("Autor: " + author);
        System.out.println("Numero da pagina: " + numberOfPages);
        System.out.println("Pagina atual: " + currentPage);
    }
}
