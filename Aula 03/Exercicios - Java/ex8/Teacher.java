package ex8;

public class Teacher {

    String name;
    String discipline;
    double salary;

    public Teacher(String name, String discipline, double salary) {
        this.name = name;
        this.discipline = discipline;
        this.salary = salary;
    }

    public void Teach() {
        System.out.println(name + " está dando aula de " + discipline + ".");
    }

    public void correctTests() {
        System.out.println(name + " está corrigindo provas de " + discipline + ".");
    }

    public void displayInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Disciplina: " + discipline);
        System.out.println("Salário: R$ " + salary);
    }
}
