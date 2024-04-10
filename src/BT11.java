import java.util.ArrayList;
import java.util.List;

public class BT11 {
    public static void main(String[] args) {
        FootBallTeam team1 = new FootBallTeam(1, "Team 1", 10, 5);
        FootBallTeam team2 = new FootBallTeam(2, "Team 2", 10, 10);
        FootBallTeam team3 = new FootBallTeam(3, "Team 3", 10, 5);
        ArrayList<FootBallTeam> teams =  new ArrayList<>(List.of(team1, team2, team3));
        System.out.println(selectionSort(teams));
        System.out.println(bubbleSort(teams));
        System.out.println(teams);
    }

    private static ArrayList<FootBallTeam> selectionSort(ArrayList<FootBallTeam> initTeams) {
        ArrayList<FootBallTeam> teams = new ArrayList<>(initTeams);

        for(int i=0; i < teams.size(); i++) {
            FootBallTeam minScoreTeam = teams.get(i);
            int minScoreTeamIndex =i;
            for(int j=i+1; j < teams.size(); j++) {
                if(teams.get(i).getScore() > teams.get(j).getScore()) {
                    minScoreTeam = teams.get(j);
                    minScoreTeamIndex = j;
                }
            }

            if(minScoreTeamIndex != i) {
                teams.set(minScoreTeamIndex,teams.get(i));
                teams.set(i,minScoreTeam);
            }
        }
        return teams;
    }

    private static ArrayList<FootBallTeam> bubbleSort(ArrayList<FootBallTeam> initTeams) {
        ArrayList<FootBallTeam> teams = new ArrayList<>(initTeams);
        for(int lenUnsorted = teams.size(); lenUnsorted > 0; lenUnsorted--) {
            for(int i = 0; i < lenUnsorted - 1; i++) {
                if(teams.get(i).getScore() > teams.get(i+1).getScore()) {
                    FootBallTeam temp = teams.get(i);
                    teams.set(i,teams.get(i+1));
                    teams.set(i+1,temp);
                }
            }
        }
        return teams;
    }
}
