package ex9;

public class ProductsMain {
    public static void main(String[] args) {
        Products product1 = new Products("Notebook", 5000.00, 10);

        product1.displayInformation();

        product1.increaseStock(5);

        product1.increaseStock(-3);

        product1.reduceStock(7);

        product1.reduceStock(20);

        product1.reduceStock(-4);

        product1.displayInformation();
    }
}
