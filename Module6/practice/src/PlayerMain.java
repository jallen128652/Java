import java.util.Scanner;
public class PlayerMain {
    public static void main(String[] args) {
        // create instance object of the player class
        Player player1 = new Player();
        // create class object for stringbuilder
        StringBuilder phrase1 = new StringBuilder();
        StringBuilder clue = new StringBuilder();
        // declare vars

        // print welcome and prompt player
        System.out.println("Welcome to Guess That Phrase!");
        System.out.println("Please enter your name: ");
        Scanner input = new Scanner(System.in);
        String name = input.nextLine();

//        constructor calls
        // note format classObject.classMethod();
        player1.setName(name);

        int tryAgain;
        do {
            // constructors to call methods and pass in objects
            randPhrase(phrase1);
            cluePhrase(phrase1, clue);
            gameFx(phrase1, player1, clue);
            System.out.println("Play another round?\nEnter 1 for yes and any other number to quit");
            tryAgain = input.nextInt();
        } while (tryAgain == 1);
    }

    // randPhraseFx: create functions for storing and calling phrases 5 phrases
    public static void randPhrase(StringBuilder phrase1) {

        int rand = (int) (Math.random() * 5);
        String[] phrase = new String[5];
        phrase[0] = "welcome to the thunderdome";
        phrase[1] = "have a nice day";
        phrase[2] = "where do you want to eat";
        phrase[3] = "are we there yet";
        phrase[4] = "how are you doing";
        // using a rand to select, pass as a stringbuilder object to gamefx()
        phrase1.append(phrase[rand]);
    }

    public static void cluePhrase(StringBuilder phrase1, StringBuilder clue){
        int length = phrase1.length();
        for (int x = 0; x < length; x++) {
            if (phrase1.charAt(x) != ' ') {
                clue.append('@');
            } else {
                clue.append(' ');
            }
        }
    }

    // gameFx: create function for comparing the stringbuilder, append, prompt,
    // search, append, tostring, compare, print, prompt again
    public static void gameFx(StringBuilder phrase1, Player player1, StringBuilder clue) {
        // store original phrase as a string
        String originalPhrase = phrase1.toString();
        // must also be converted toString each round and stored in a separate var name
        // loop through the length and store the @ value in clue for ea char in phrase1
        do {
            // show clue
            System.out.println("Your clue is: " + clue);
            // prompt
            System.out.println("Please guess a letter and press enter or enter a complete guess of the phrase. ");
            // input
            Scanner input2 = new Scanner(System.in);
//            stores input and converts to lowercase
            String attempt = input2.nextLine().toLowerCase();
            // get input length to determine if it's a char or a complete guess
            int attLength = attempt.length();
            // call to number of attempts in player class, will increment the value
//            note calls to this method in the Player class don't need an arg ass it's just incrementing
            player1.numberAttempts();
//            compares length of attempt with length of phrase to see the type of attempt
            int length = phrase1.length();
            if (attLength == length) {
//                determines if the attempt is equal to the phrase
                if (attempt.equalsIgnoreCase(phrase1.toString())) {
                    System.out.println("Congratulations, you win!");
                    break;
                } else {
                    System.out.println("Incorrect, please continue");
                }
//                if the user enters just 1 char
            } else if (attLength == 1) {
                char letter = attempt.charAt(0);
                boolean foundMatch = false;
            for (int i = 0; i < length; i++) {
                char c = originalPhrase.charAt(i);
                if (c == letter) {
                    clue.setCharAt(i, letter);
                    foundMatch = true;
                }
            }
            if (foundMatch) {
                System.out.println("Letter found! Keep going.");
            } else {
                System.out.println("No matches for " + letter);
            }
        } else {
            System.out.println("Invalid input. Please enter a single letter or the complete phrase.");
        }

        } while (!phrase1.toString().contentEquals(clue));
        player1.display();
        clue.setLength(0);

    }
}
