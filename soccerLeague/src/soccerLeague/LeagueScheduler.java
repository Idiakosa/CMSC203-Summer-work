package soccerLeague;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class LeagueScheduler {
    private Team[] teams = new Team[4];
    private ArrayList<Game> games = new ArrayList<>();
    private int freezeCount = 0;
    private int gameId = 1;
    private int hottestTemp = Integer.MIN_VALUE;
    private int tempSum = 0;
    private int tempEntries = 0;

    public LeagueScheduler() {
        teams[0] = new Team("Team 1");
        teams[1] = new Team("Team 2");
        teams[2] = new Team("Team 3");
        teams[3] = new Team("Team 4");
    }

    public void runSeason() {
        Scanner scanner = new Scanner(System.in);
        while (freezeCount < 3) {
            System.out.print("Enter temperature: ");
            int temp = scanner.nextInt();
            if (temp <= 32) {
                freezeCount++;
                System.out.println("Too cold to play.");
                continue;
            }

            freezeCount = 0;
            hottestTemp = Math.max(hottestTemp, temp);
            tempSum += temp;
            tempEntries += 1;

            // Randomize matchups without repeats
            ArrayList<Integer> indices = new ArrayList<>(List.of(0,1,2,3));
            Collections.shuffle(indices);

            for (int i = 0; i < 4; i += 2) {
                Team t1 = teams[indices.get(i)];
                Team t2 = teams[indices.get(i+1)];
                Game g = new Game(gameId++, t1, t2, temp);
                // Simulate game, update stats
                games.add(g);
            }
        }

        printResults();
    }

    private void printResults() {
        System.out.println("\n*********RESULTS*********");
        for (Team t : teams) {
            // Print team stats
        }
        for (Game g : games) {
            // Print game details
        }
        System.out.println("Hottest Temp: " + hottestTemp);
        System.out.println("Average Temp: " + (tempEntries > 0 ? (double) tempSum / tempEntries : 0));
    }
}
