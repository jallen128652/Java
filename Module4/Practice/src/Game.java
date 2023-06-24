public class Game {
    //Declarations go here. All variables and constants in this section should be private.
    private String name;

    //Public functions go here. Do not use the keyword static.
    public void setName(String name) {
        //This function will be used to receive the player's name from main and set it in the class.
        //This function is complete and does not need to be changed. DO NOT MODIFY!

        this.name = name;
    }

    public void testWinner(String strWeapon, String compWeapon) {
        //This method will receive the string weapons from main and then will test to see who won.
        //It will then print out the results of the game including which weapons the player and computer chose,
        //who won the game and why they won.
        //        if else to determine winner or tie could've probably been a switch case
        if(strWeapon.equals("Knife") && compWeapon.equals("Spear")){
            System.out.println(name + " wins because Knife sneaks up on Spear.");
        } else if (strWeapon.equals("Spear") && compWeapon.equals("Bow")) {
            System.out.println(name + " wins because Spear does more damage than Bow.");
        } else if (strWeapon.equals("Bow") && compWeapon.equals("Knife")) {
            System.out.println(name + " wins because Bow out-ranges Knife.");
        } else if (strWeapon.equals("Spear") && compWeapon.equals("Knife")) {
                System.out.println("Computer wins because Knife sneaks up on Spear.");
        } else if (strWeapon.equals("Bow") && compWeapon.equals("Spear")) {
            System.out.println("Computer wins because Spear does more damage than Bow.");
        } else if (strWeapon.equals("Knife") && compWeapon.equals("Bow")) {
            System.out.println("Computer wins because Bow out-ranges Knife.");
        } else if (strWeapon.equals("Spear") || compWeapon.equals("Spear")) {
            System.out.println("There was a tie");
        } else if (strWeapon.equals("Bow") || compWeapon.equals("Bow")) {
            System.out.println("There was a tie");
        } else if (strWeapon.equals("Knife") || compWeapon.equals("Knife")) {
            System.out.println("There was a tie");
        }

    }
}
