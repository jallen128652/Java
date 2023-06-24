import java.util.Scanner;


public class Main {
    //This is the global section. All variables and constants declared here can be seen and used by the entire program.
    //Do not declare variables and constants in this section.

    public static void main(String[] args) {
        //Write the code for main that will ask the user for the name and set it in the class using the object "player" below.
        //Then call the function "chooseWeapon" which will print a menu for user to choose a weapon from.
        //Then call the function "getCompWeapon" which will randomly assign a weapon to the computer.
        //Then call the "testWinner" function from the Game class to see who won and why.

        //Declarations
        Game player = new Game();  //This is an object of your Game class, DO NOT create more objects of the Game class.
//        variables
        String strWeapon;
        String compWeapon;
        String playerName;
//        scanner
        Scanner name = new Scanner(System.in);
//        using player object input name and set name
        System.out.println("Please enter name: ");
        playerName = name.nextLine();
        player.setName(playerName);
//        call to choose weapon
        strWeapon = chooseWeapon();
        System.out.println(playerName + " chose " + strWeapon);
//        call to get the computers weapon
        compWeapon = getCompWeapon();
        System.out.println("Computer chose " + compWeapon);
//        using the player object call to test who is the winner, passes in both weapon choices
        player.testWinner(strWeapon, compWeapon);
    }

    public static String chooseWeapon() {
        //This function will print a menu of weapons for the player to choose from.
        //It will then take the integer input by the user and convert it into a string weapon.
        //It will then return the string weapon to main.
        String strWeapon;
        Scanner input = new Scanner(System.in);
        System.out.println("Weapons Menu:\n 1. Knife\n 2. Spear\n 3. Bow\n Choose a number: ");
        int choice = input.nextInt();
        switch (choice) {
            case 1:
                strWeapon = "Knife";
                break;
            case 2:
                strWeapon = "Spear";
                break;
            case 3:
                strWeapon = "Bow";
                break;
            default:
                strWeapon = "Invalid choice";
                break;
        }
        return strWeapon;

    }
    public static String getCompWeapon() {
        //This function will generate a random number to choose a weapon for the computer.
        //It will then convert the random number into a string weapon.
        //It will return the string weapon to main.
        String cWeapon;
//        uses the random from the SomeRandomNumbers example instead of importing the random utility way
        int random = 1 + (int)(Math.random() * 3);
        if (random == 1){
            cWeapon = "Knife";
        } else if (random == 2) {
            cWeapon = "Spear";
        } else {
            cWeapon = "Bow";
        }
        return cWeapon;
    }
}
