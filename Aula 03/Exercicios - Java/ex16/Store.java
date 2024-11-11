package ex16;

public class Store {
    private String name;
    private String address;
    private String phone;

    public Store(String name, String address, String phone) {
        this.name = name;
        this.address = address;
        this.phone = phone;
    }

    public void open() {
        System.out.println("A loja " + name + " está aberta.");
    }

    public void close() {
        System.out.println("A loja " + name + " está fechada.");
    }
}

