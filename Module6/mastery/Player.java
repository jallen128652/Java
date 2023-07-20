public class Player {
    private String name;
    private int numAttempts;

    public void setName(String playerName) {
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public int numberAttempts(int numAtt) {
        numAtt = numAttempts;
        numAtt++;
        return numAtt;
    }

}