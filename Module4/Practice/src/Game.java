public class Game {
    //Declarations go here. All variables and constants in this section should be private.
    private String name;
    private String strWeapon;
    private String compWeapon;

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
        this.strWeapon = strWeapon;
        this.compWeapon = compWeapon;
//        if else to determine winner or tie could've probably been a switch case
        if(strWeapon.equals("Water") && compWeapon.equals("Fire")){
            System.out.println(name + " wins because water puts out fire.");
        } else if (this.strWeapon.equals("Fire") && this.compWeapon.equals("Wood")) {
            System.out.println(name + " wins because fire burns wood.");
        } else if (this.strWeapon.equals("Wood") && this.compWeapon.equals("Water")) {
            System.out.println(name + " wins because wood dams water.");
        } else if (this.strWeapon.equals("Fire") && this.compWeapon.equals("Water")) {
                System.out.println("Computer wins because water puts out fire.");
        } else if (this.strWeapon.equals("Wood") && this.compWeapon.equals("Fire")) {
            System.out.println("Computer wins because fire burns wood.");
        } else if (this.strWeapon.equals("Water") && this.compWeapon.equals("Wood")) {
            System.out.println("Computer wins because wood dams water.");
        } else if (this.strWeapon.equals("Fire") || this.compWeapon.equals("Fire")) {
            System.out.println("There was a tie");
        } else if (this.strWeapon.equals("Wood") || this.compWeapon.equals("Wood")) {
            System.out.println("There was a tie");
        } else if (this.strWeapon.equals("Water") || this.compWeapon.equals("Water")) {
            System.out.println("There was a tie");
        }

    }
}
