public class BowlingTeam {
    private String teamName;
    private String[] members = new String[4];

    public void setTeamName(String team){
        teamName = team;
    }
    public String getTeamName(){
        return teamName;
    }
    public void setMembers(int number, String name){
        members[number] = name;
    }
    public String getMembers(int number){
        return members[number];
    }
}
