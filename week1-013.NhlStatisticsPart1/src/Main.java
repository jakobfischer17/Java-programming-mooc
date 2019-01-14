
import nhlstats.NHLStatistics;

public class Main {

    public static void main(String[] args) {
        System.out.println("Top ten players based on goals: ");
        NHLStatistics.sortByGoals();
        NHLStatistics.top(10);
        System.out.println("Top 25 based on penalty amounts: ");
        NHLStatistics.sortByPenalties();
        NHLStatistics.top(25);
        System.out.println("Statistics for Sidney Crosby: ");
        NHLStatistics.searchByPlayer("Sidney Crosby");
        System.out.println("statistics for the Philadephia Flyers: ");
        NHLStatistics.teamStatistics("PHI");
        System.out.println("Team statistics for Anaheim Ducks ordered by points: ");
        NHLStatistics.sortByPoints();
        NHLStatistics.teamStatistics("ANA");

    }
}
