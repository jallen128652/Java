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
        gameFx(phrase1, player1, null);

    }

    // gameFx: create function for comparing the stringbuilder, append, prompt,
    // search, append, tostring, compare, print, prompt again
    public static void gameFx(StringBuilder phrase1, Player player1, Scanner input) {
        // store original phrase as a string
        String originalPhrase = phrase1.toString();
        // create clue objects
        StringBuilder clue = new StringBuilder();
        String clueString;
        // declare var for the to pass into the Player class numberAttempts()
        int numAttempts = 0;
        // must also be converted tostring each round and stored in a separate var name
        // loop through the length and store the @ value in clue for ea char in phrase1
        do {
            int length = phrase1.length();
            for (int x = 0; x < length; x++) {
                if (phrase1.charAt(x) != ' ') {
                    clue.append('@');
                } else {
                    clue.append(' ');
                }
            }
            //
            System.out.println("Your clue is: " + clue);
            System.out.println("Please guess a letter and press enter. ");
            String attempt = input.nextLine();
            int attLength = attempt.length();
            // call to number of attempts in player class, will increment the value
            player1.numberAttempts(numAttempts);
            if (attLength == length) {
                if (originalPhrase.equals(attempt)) {
                    System.out.println("Congratulations, you win!");
                } else {
                    System.out.println("Incorrect, please continue");
                }
            } else {
                // compare input char to phrase using idexOf()
                // if(match){
                // append clue
                // }
            }
            // converts clue and updates the loop control
            clueString = clue.toString();

        } while (!originalPhrase.equals(clueString));
        // call display
        // call reset numAtt
    }
}