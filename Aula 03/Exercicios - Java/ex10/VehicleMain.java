package ex10;

public class VehicleMain {
    public static void main(String[] args) {
        Vehicle vehicle1 = new Vehicle("Carro", "ABC-1234", "Rosa");

        vehicle1.displayInfo();

        vehicle1.refuel(30);

        vehicle1.refuel(-5);

        vehicle1.wash();

        vehicle1.displayInfo();
    }
}
