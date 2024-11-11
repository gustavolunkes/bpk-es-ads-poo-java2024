package ex21;

public class Kitchen {
    private String type;
    private int numberOfPeople;
    private String color;

    public Kitchen(String type, int numberOfPeople, String color) {
        this.type = type;
        this.numberOfPeople = numberOfPeople;
        this.color = color;
    }

    public void cook() {
        System.out.println("Cozinhando na cozinha " + type + ".");
    }

    public void clean() {
        System.out.println("Limpando a cozinha " + type + ".");
    }
}
