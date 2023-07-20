public class Player {
    // declare private vars to encapsulate the players infor
    private String name;
    public int numAttempts;

    // set name from PlayerMain input
    public void setName(String playerName) {
        name = playerName;
    }

    public String getName() {
        // pass name to any caller
        return name;
    }

    public int numberAttempts(int numAtt) {
        numAttempts = numAtt;
        // increment
        numAtt++;
        return numAtt;
    }

    public void display(String name, int numAtt) {
        // print stats
        System.out.println("Player " + name + " completed the round in " + numAtt + " attempts!");
        // reset number of attempts
        numAtt = 0;
    }
}
