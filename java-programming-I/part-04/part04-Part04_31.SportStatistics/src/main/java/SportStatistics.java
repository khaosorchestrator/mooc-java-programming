
import java.nio.file.Paths;
import java.util.Scanner;

public class SportStatistics {

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("File:");
        String file = scan.nextLine();

        try (Scanner input = new Scanner(Paths.get(file))) {
            System.out.println("Team: ");
            String team = scan.nextLine();

            int countGames = 0;
            int countWins = 0;
            int countLosses = 0;

            while (input.hasNextLine()) {
                String[] game = input.nextLine().split(",");

                String homeTeam = game[0];
                String visitingTeam = game[1];

                int homeTeamPoints = Integer.valueOf(game[3]);
                int visitingTeamPoints = Integer.valueOf(game[2]);

                if (team.equals(homeTeam) || team.equals(visitingTeam)) {
                    countGames++;

                    if (homeTeamPoints > visitingTeamPoints) {
                        countWins++;
                    } else {
                        countLosses++;
                    }
                }
            }
            System.out.println("Games: " + countGames);
            System.out.println("Wins: " + countWins);
            System.out.println("Losses: " + countLosses);
        } catch (Exception e) {
        }
    }

}
