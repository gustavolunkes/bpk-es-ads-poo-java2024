package ex16;

public class StoreMain {
    public static void main(String[] args) {
        Store store = new Store("Supermercado Bom Preço", "Rua das Flores, 123", "(11) 98765-4321");
        store.open();
        store.close();
    }
}
