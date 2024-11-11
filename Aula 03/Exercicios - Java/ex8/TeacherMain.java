package ex8;

public class TeacherMain {

    public static void main(String[] args) {
        Teacher teacher1 = new Teacher("Jhoni Eldor", "Orientação a Objetos e UML", 3500.00);

        teacher1.displayInformation();

        teacher1.Teach();

        teacher1.correctTests();
    }
}
