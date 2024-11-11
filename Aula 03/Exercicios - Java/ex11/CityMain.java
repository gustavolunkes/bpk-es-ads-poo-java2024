package ex11;

public class CityMain {
    public static void main(String[] args) {
        City city = new City("Toledo", 145000, "PR");
        city.increasePopulation(1000);
        city.decreasePopulation(5000);
        System.out.println("População atual: " + city.getPopulation());
    }
}
