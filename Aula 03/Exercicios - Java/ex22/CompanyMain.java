package ex22;

public class CompanyMain {
    public static void main(String[] args) {
        Company company = new Company("Tech Solutions", "12.345.678/0001-99", 50);
        company.hireEmployee();
        company.fireEmployee();
        System.out.println("Número de funcionários: " + company.getNumberOfEmployees());
    }
}
