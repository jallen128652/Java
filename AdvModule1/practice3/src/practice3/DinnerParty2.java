/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice3;

/**
 *
 * @author druid
 */
public class DinnerParty2 extends Party {
    private int dinnerChoice;
    
    public int getDinnerChoice(){
    return dinnerChoice;
    }
    public void setDinnerChoice(int choice){
    dinnerChoice = choice;
    }
    
     //        overrides the party class   
    @Override
    public void displayInvitation(){
        System.out.println("Please come to my dinner party!");    
    }
}

