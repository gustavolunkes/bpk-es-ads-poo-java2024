package ex5;

public class Puppy {
    String name;
    String breed;
    int age;

    public Puppy(String name, String breed, int age) {
        this.name = name;
        this.breed = breed;
        this.age = age;
    }
    public void bark(){
        System.out.println(name + " esta latindo: Au Au");
    }
    public void run(){
        System.out.println(name + " esta correndo!");
    }
}
