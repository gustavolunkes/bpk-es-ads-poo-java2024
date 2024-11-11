package ex14;

public class TeamMain {
    public static void main(String[] args) {
        Team team = new Team("Flamengo", "Jorge Jesus", 11);
        team.addPlayer();
        team.removePlayer();
        System.out.println("Número de jogadores: " + team.getNumberOfPlayers());
    }
}