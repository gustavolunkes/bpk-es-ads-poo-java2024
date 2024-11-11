package ex15;

public class Game {
    private String name;
    private String genre;
    private double price;

    public Game(String name, String genre, double price) {
        this.name = name;
        this.genre = genre;
        this.price = price;
    }

    public void start() {
        System.out.println("Iniciando o jogo " + name + ".");
    }

    public void pause() {
        System.out.println("Pausando o jogo " + name + ".");
    }
}
