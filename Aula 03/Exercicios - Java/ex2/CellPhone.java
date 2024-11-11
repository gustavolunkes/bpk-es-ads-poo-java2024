package ex2;

public class CellPhone {

    String mark;
    String model;
    int batteryCapacity;

    void turnOn() {
        System.out.println("O celular ligou.");
    }

    void turnOff() {
        System.out.println("O celular desligou.");
    }

    CellPhone(String mark, String model, int batteryCapacity) {
        this.mark = mark;
        this.model = model;
        this.batteryCapacity = batteryCapacity;
    }
}
