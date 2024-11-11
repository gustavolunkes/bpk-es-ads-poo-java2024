package ex11;

public class City {
    private String name;
    private int population;
    private String state;

    public City(String name, int population, String state) {
        this.name = name;
        this.population = population;
        this.state = state;
    }

    public void increasePopulation(int amount){
        if (amount > 0) {
            population += amount;
        }
    }

    public void decreasePopulation(int amount) {
        if (amount > 0 && amount <= population) {
            population -= amount;
        }
    }

    public int getPopulation() {
        return population;
    }
}
