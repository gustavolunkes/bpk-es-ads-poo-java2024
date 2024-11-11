package ex12;

public class Movie {
    private String title;
    private String director;
    private int duration; // em minutos

    public Movie(String title, String director, int duration) {
        this.title = title;
        this.director = director;
        this.duration = duration;
    }

    public void start() {
        System.out.println("Iniciando o filme " + title + " dirigido por " + director + ".");
    }

    public void stop() {
        System.out.println("Parando o filme " + title + ".");
    }
}
