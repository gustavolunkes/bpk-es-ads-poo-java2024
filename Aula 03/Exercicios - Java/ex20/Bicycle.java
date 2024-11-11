package ex20;

public class Bicycle {
    private String brand;
    private String model;
    private int wheelSize; // em polegadas

    public Bicycle(String brand, String model, int wheelSize) {
        this.brand = brand;
        this.model = model;
        this.wheelSize = wheelSize;
    }

    public void pedal() {
        System.out.println("Pedalando a bicicleta " + brand + " " + model + ".");
    }

    public void brake() {
        System.out.println("Freando a bicicleta " + brand + " " + model + ".");
    }
}
