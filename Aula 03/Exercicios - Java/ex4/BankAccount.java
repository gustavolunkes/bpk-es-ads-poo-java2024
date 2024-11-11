package ex4;

public class BankAccount {
    String accountNumber;
    double balance;

    public BankAccount(String accountNumber, double balance) {
        this.accountNumber = accountNumber;
        this.balance = balance;
    }
    public String getAccountNumber() {
        return accountNumber;
    }
    public double getBalance() {
        return  balance;
    }
    public void deposit(double value) {
        if(value > 0) {
            balance += value;
            System.out.println("Deposito de R$" + value + " realizado com sucesso.");
        }else {
            System.out.println("O valor de deposito deve ser positivo.");
        }
    }
    public void withdraw(double value) {
        if(value > 0 && value <= balance) {
            balance -= value;
            System.out.println("Saque de R$" + value + " realizado com sucesso.");
        }else {
            System.out.println("Saldo insuficiente ou valor de saque invalido.");
        }
    }
}
