public class Player {
//    declare private obj's and vars for encapsulation
    private String name;
    private int numAttempts;
//    set name from PlayerMain input
    public void setName(String playerName) {
        name = playerName;
    }
//    return name to any fx that calls
//    possibly don't need this as the obj is utilized within this class
    public String getName() {
        return name;
    }
//    increment the attempts
    public void numberAttempts() {
        numAttempts++;
    }
//  display results for each round
    public void display() {
        System.out.println("Player " + name + " completed the round in " + numAttempts + " attempts!");
        numAttempts = 0;
    }
}
