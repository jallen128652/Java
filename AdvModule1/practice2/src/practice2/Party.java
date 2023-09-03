/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice2;

/**
 *
 * @author druid
 */
public class Party {
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
}
