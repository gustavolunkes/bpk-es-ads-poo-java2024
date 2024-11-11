package ex5;

public class MainPuppy {
    public static void main(String[] args) {

        Puppy myPuppy = new Puppy("Lana", "Vira-lata", 3);

        myPuppy.bark();
        myPuppy.run();
        System.out.println("Nome: " + myPuppy.name);
        System.out.println("Raça: " + myPuppy.breed);
        System.out.println("Idade: " + myPuppy.age);
    }
}
