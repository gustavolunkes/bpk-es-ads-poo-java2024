package ex9;

public class Products {

    String name;
    double price;
    int stockQuantity;

    public Products(String name, double price, int stockQuantity) {
        this.name = name;
        this.price = price;
        this.stockQuantity = stockQuantity;
    }

    public void increaseStock(int amount) {
        if (amount > 0) {
            stockQuantity += amount;
            System.out.println(amount + " unidades adicionadas ao estoque. Estoque atual: " + stockQuantity);
        } else {
            System.out.println("A quantidade a ser adicionada deve ser maior que zero.");
        }
    }

    public void reduceStock(int amount) {
        if (amount > 0 && amount <= stockQuantity) {
            stockQuantity -= amount;
            System.out.println(amount + " unidades removidas do estoque. Estoque atual: " + stockQuantity);
        } else if (amount > stockQuantity) {
            System.out.println("Não é possível remover mais do que o estoque disponível.");
        } else {
            System.out.println("A quantidade a ser removida deve ser maior que zero.");
        }
    }

    public void displayInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Preço: R$ " + price);
        System.out.println("Quantidade em Estoque: " + stockQuantity);
    }
}
