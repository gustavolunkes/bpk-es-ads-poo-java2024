package ex22;

public class Company {
    private String name;
    private String cnpj;
    private int numberOfEmployees;

    public Company(String name, String cnpj, int numberOfEmployees) {
        this.name = name;
        this.cnpj = cnpj;
        this.numberOfEmployees = numberOfEmployees;
    }

    public void hireEmployee() {
        numberOfEmployees++;
    }

    public void fireEmployee() {
        if (numberOfEmployees > 0) {
            numberOfEmployees--;
        }
    }

    public int getNumberOfEmployees() {
        return numberOfEmployees;
    }
}
