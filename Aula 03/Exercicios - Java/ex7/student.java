package ex7;

public class student {

    String name;
    String registration;
    String course;

    public student(String name, String registration, String course) {
        this.name = name;
        this.registration = registration;
        this.course = course;
    }

    public double calculateAverage(double[] notes) {
        double sum = 0;
        for (double note : notes) {
            sum += note;
        }
        return sum / notes.length;
    }

    public void displayInformation() {
        System.out.println("Nome: " + name);
        System.out.println("Matrícula: " + registration);
        System.out.println("Curso: " + course);
    }
}
