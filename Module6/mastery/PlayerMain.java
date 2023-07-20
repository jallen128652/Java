import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {
        // create instance object of the player class
        Player player1 = new Player();
        // declare vars
        int numAttempts = 0;
        // print welcome and prompt player
        System.out.println("Welcome to Guess That Phrase!");
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();
    
        // pass name to player class to set
        // note format classObject.classMethod();
        player1.setName(name);
        // create do while loop for game that repeats till the player chooses option 2 and calls randPhrase()
        
        int tryAgain;
        do {
            // constructors to call methods
            randPhrase();
            System.out.println("Play another round?\nEnter 1 for yes and any other number to quit");
            tryAgain = input.nextInt();
        } while(tryAgain == 1);
        // test call to number of attempts
        player1.numberAttempts(numAttempts);
    }
       // randPhraseFx: create functions for storing and calling phrases 5 phrases
     public static void randPhrase(){
    
        int rand = (int)(Math.random() * 5);
        String[] phrase = new String[5];
        phrase[0] = "welcome to the thunderdome";
        phrase[1] = "have a nice day";
        phrase[2] = "where do you want to eat";
        phrase[3] = "are we there yet";
        phrase[4] = "how are you doing";
    // // using a rand to select, pass as a stringbuilder object to gamefx
        StringBuilder phrase1 = new StringBuilder();
        phrase1.append(" "+phrase[rand]);
        gameFx(phrase1);
     }

    public static void gameFx(StringBuilder phrase1){
        // test passed int phrase1
        System.out.println(phrase1);
    // gameFx: create function for comparing the stringbuilder append using

    // indexOf() to search and append as long as the value returned isnt -1
    // provide clue prior to attemps
    // get user input for attempt
    // allow for option to solve and use compare
    // use indexOf() to check for matches

    // if matches setCharAt()
    // call numberAttempts()
    // print current StringBuilder
    // prompt again

    // else
    // print no match
    // call numberAttempts()
    // prompt again
    }
}