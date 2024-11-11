package ex6;

public class Computer {

    String processor;
    int RAMmemory;
    int storage;
    boolean conected;


    public Computer(String processor, int RAMmemory, int storage) {
        this.processor = processor;
        this.RAMmemory = RAMmemory;
        this.storage = storage;
        this.conected = false;
    }

    public void toConnect() {
        if (conected) {
            System.out.println("O computador já está ligado.");
        } else {
            conected = true;
            System.out.println("O computador está ligado.");
        }
    }

    public void disconnect() {
        if (conected) {
            conected = false;
            System.out.println("O computador está desligado.");
        } else {
            System.out.println("O computador já está desligado.");
        }
    }

    public void displayInformation() {
        System.out.println("Processador: " + processor);
        System.out.println("Memória RAM: " + RAMmemory + " GB");
        System.out.println("Armazenamento: " + storage + " GB");
        System.out.println("Estado: " + (conected ? "Ligado" : "Desligado"));
    }
}
