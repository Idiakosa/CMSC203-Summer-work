package soccerLeague;

public class Game {
    private int id;
    private Team homeTeam, awayTeam;
    private int homeScore, awayScore;
    private int temperature;

    public Game(int id, Team homeTeam, Team awayTeam, int temp) {
        this.id = id;
        this.homeTeam = homeTeam;
        this.awayTeam = awayTeam;
        this.temperature = temp;
    }

    // Method to simulate score generation based on temperature
    // Getters and formatted output
}