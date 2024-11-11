package ex10;

public class Vehicle {

    String type;
    String licensePlate;
    String color;
    double fuelLevel;

    public Vehicle(String type, String licensePlate, String color) {
        this.type = type;
        this.licensePlate = licensePlate;
        this.color = color;
        this.fuelLevel = 0;
    }

    public void refuel(double liters) {
        if (liters > 0) {
            fuelLevel += liters;
            System.out.println("Veículo abastecido com " + liters + " litros. Nível atual de combustível: " + fuelLevel + " litros.");
        } else {
            System.out.println("A quantidade de combustível a ser abastecida deve ser maior que zero.");
        }
    }

    public void wash() {
        System.out.println("O veículo " + licensePlate + " está sendo lavado.");
    }

    public void displayInfo() {
        System.out.println("Tipo: " + type);
        System.out.println("Placa: " + licensePlate);
        System.out.println("Cor: " + color);
        System.out.println("Nível de Combustível: " + fuelLevel + " litros");
    }
}
