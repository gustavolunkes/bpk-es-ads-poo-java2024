package ex12;

public class MovieMain {
    public static void main(String[] args) {
        Movie movie = new Movie("Malevola", "Robert Stromberg", 97);
        movie.start();
        movie.stop();
    }
}
