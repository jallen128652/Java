/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice1;

/**
 *
 * @author druid
 */
import java.util.*;
public class UseParty {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        int guests;
        Party aParty = new Party();
        Scanner keyboard = new Scanner(System.in);
        System.out.print("Enter the number of guests for the party >> ");
        guests = keyboard.nextInt();
        aParty.setGuests(guests);
        System.out.println("The party has " + aParty.getGuests() + " guests");
        aParty.displayInvitation();          
    }
    
}
