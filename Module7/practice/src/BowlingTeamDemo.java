import java.util.*;
public class BowlingTeamDemo {
    public static void main(String[] args){
        String name;
        BowlingTeam bowlTeam = new BowlingTeam();
        int x;
        final int NUM_TEAM_MEMBERS = 4;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter team name: ");
        name = input.nextLine();
        bowlTeam.setTeamName(name);
        for(x = 0; x < NUM_TEAM_MEMBERS; ++x){
            System.out.println("Enter team member's name: ");
            name = input.nextLine();
            bowlTeam.setMembers(x, name);
        }
        System.out.println("\nMembers of team " + bowlTeam.getTeamName());
        for(x = 0; x < NUM_TEAM_MEMBERS; ++x){
            System.out.println(bowlTeam.getMembers(x) + " ");
        }
    }
}
