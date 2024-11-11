package ex2;

public class MainCP {
    public static void main(String[] args) {
        CellPhone myCellPhone = new CellPhone("Xiaomi", "Note 13", 5000);

        System.out.println("Marca: " + myCellPhone.mark);
        System.out.println("Modelo: " + myCellPhone.model);

        myCellPhone.turnOn();
        myCellPhone.turnOff();
    }
}
