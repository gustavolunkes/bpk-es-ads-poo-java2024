package ex7;

public class StudentsMain {
    public static void main(String[] args) {
        student student1 = new student("Amanda Freitas", "20234596", "Engenharia de Software");

        student1.displayInformation();

        double[] notes = {7.5, 8.0, 9.2, 6.8, 8.5};

        double average = student1.calculateAverage(notes);
        System.out.println("Média das notas: " + average);
    }
}
