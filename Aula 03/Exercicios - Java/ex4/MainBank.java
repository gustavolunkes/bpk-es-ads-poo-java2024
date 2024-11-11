package ex4;

public class MainBank {
    public static void main(String[] args) {
        BankAccount myAccount = new BankAccount("40028922", 25000.0);

        myAccount.deposit(600.0);
        myAccount.withdraw(158.0);
        System.out.println("Saldo atual: R$" + myAccount.getBalance());
    }
}
