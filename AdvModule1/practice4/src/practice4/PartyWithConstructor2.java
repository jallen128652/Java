/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package practice4;

/**
 *
 * @author druid
 */
public class PartyWithConstructor2 {
    private int guests;
    
    public int getGuests(){
    return guests;
    }
    
    public void setGuests(int numGuests){
     guests = numGuests;   
    }
    
    public void displayInvitation(){
    System.out.println("Please come to my party!");
    }
    public PartyWithConstructor2(int numGuests){
        System.out.println("Creating a Party");
        guests = numGuests;
    }
    
}
