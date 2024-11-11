package ex14;

public class Team {
    private String name;
    private String coach;
    private int numberOfPlayers;

    public Team(String name, String coach, int numberOfPlayers) {
        this.name = name;
        this.coach = coach;
        this.numberOfPlayers = numberOfPlayers;
    }

    public void addPlayer() {
        numberOfPlayers++;
    }

    public void removePlayer() {
        if (numberOfPlayers > 0) {
            numberOfPlayers--;
        }
    }

    public int getNumberOfPlayers() {
        return numberOfPlayers;
    }
}
