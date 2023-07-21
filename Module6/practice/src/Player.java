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

    public void display(String name, int numAtt) {
        System.out.println("Player " + name + " completed the round in " + numAtt + " attempts!");
        numAtt = 0;
    }

}
