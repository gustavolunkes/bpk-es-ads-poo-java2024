package ex17;

public class Animal {
    private String species;
    private int age;
    private double weight;

    public Animal(String species, int age, double weight) {
        this.species = species;
        this.age = age;
        this.weight = weight;
    }

    public void feed() {
        System.out.println("Alimentando o " + species + ".");
    }

    public void sleep() {
        System.out.println("O " + species + " está dormindo.");
    }
}
