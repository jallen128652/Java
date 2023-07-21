public class Player {
    private String name;
    public int numAttempts;

    public void setName(String playerName) {
        name = playerName;
    }

    public String getName() {
        return name;
    }

    public int numberAttempts() {
        numAttempts++;
        return numAttempts;
    }

    public void display() {
        System.out.println("Player " + name + " completed the round in " + numAttempts + " attempts!");
        numAttempts = 0;
    }
}
