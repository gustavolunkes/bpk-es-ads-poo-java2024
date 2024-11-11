package ex3;

public class People {
    String name;
    int age;
    double height;

    public People(String name, int age, double height) {
        this.name = name;
        this.age = age;
        this.height = height;
    }

    public void toPresent(){
        System.out.println("Oie, tudo bem? Meu nome é " + name + ", tenho " + age + " anos e minha altura é " + height + "metros.");
    }
}
