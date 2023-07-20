import java.util.Scanner;

public class PlayerMain {
    public static void main(String[] args) {
        // create instance object of the player class
        Player player1 = new Player();
        // create class object for stringbuilder
        StringBuilder phrase1 = new StringBuilder();
        // declare vars

        // print welcome and prompt player
        System.out.println("Welcome to Guess That Phrase!");
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

        // pass name to player class to set
        // note format classObject.classMethod();
        player1.setName(name);

        int tryAgain;
        do {
            // constructors to call methods and pass in objects
            randPhrase(player1, phrase1);
            System.out.println("Play another round?\nEnter 1 for yes and any other number to quit");
            tryAgain = input.nextInt();
        } while (tryAgain == 1);
    }

    // randPhraseFx: create functions for storing and calling phrases 5 phrases
    public static void randPhrase(Player player1, StringBuilder phrase1) {

        int rand = (int) (Math.random() * 5);
        String[] phrase = new String[5];
        phrase[0] = "welcome to the thunderdome";
        phrase[1] = "have a nice day";
        phrase[2] = "where do you want to eat";
        phrase[3] = "are we there yet";
        phrase[4] = "how are you doing";
        // // using a rand to select, pass as a stringbuilder object to gamefx

        phrase1.append(" " + phrase[rand]);
        gameFx(phrase1, player1);

    }

    // gameFx: function for comparing the stringbuilder, append, prompt,
    // search, append, tostring, compare, print, prompt again
    public static void gameFx(StringBuilder phrase1, Player player1) {
        // store original phrase as a string
        String originalPhrase = phrase1.toString();
        // create clue objects
        StringBuilder clue = new StringBuilder();
        // declare obj to store string
        String clueString;
        // declare var for the to pass into the Player class numberAttempts()
        int numAttempts = 0;

        // must also be converted tostring each round and stored in a separate var name
        // loop through the length and store the @ value in clue for ea char in phrase1
        do {
            // clear the stringbuilder each round
            clue.setLength(0);

            int length = phrase1.length();
            for (int x = 0; x < length; x++) {
                if (phrase1.charAt(x) != ' ') {
                    clue.append('@');
                } else {
                    clue.append(' ');
                }
            }
            // show clue
            System.out.println("Your clue is: " + clue);
            // prompt
            System.out.println("Please guess a letter and press enter or enter a complete guess of the phrase. ");
            // input
            Scanner input2 = new Scanner(System.in);
            // convert toLower so its case insensitive
            String attempt = input2.nextLine().toLowerCase();
            // get input length to determine if it's a char or a complete guess
            int attLength = attempt.length();
            // call to number of attempts in player class, will increment the value
            // declare var for the to pass into the Player class var numAttempts and method
            // numberAttempts()
            numAttempts = player1.numberAttempts(numAttempts);

            if (attLength == 1) {
                // Single-letter guess
                int index = originalPhrase.indexOf(attempt);
                while (index != -1) {
                    clue.setCharAt(index, Character.toLowerCase(originalPhrase.charAt(index))); // Convert to lowercase
                    // before updating
                    index = originalPhrase.indexOf(attempt, index + 1);
                }

                if (!clue.toString().contains("@")) {
                    // All letters have been revealed
                    System.out.println("Congratulations, you win!");
                    player1.display(player1.getName(), numAttempts);
                    return;
                } else if (originalPhrase.indexOf(attempt) != -1) {
                    // At least one match found
                    System.out.println("Correct guess!");
                } else {
                    // No matches found
                    System.out.println("No matches for " + attempt);
                }
            } else {
                // Complete phrase guess
                if (originalPhrase.equals(attempt)) {
                    // Display congratulatory message with player name
                    System.out.println("Congratulations, you win!");
                    player1.display(player1.getName(), numAttempts);
                    return;
                } else {
                    System.out.println("Incorrect, please continue");
                }
            }
            // converts clue and updates the loop control
            clueString = clue.toString();

        } while (clueString.contains("@"));
        player1.display(player1.getName(), numAttempts);
    }
}