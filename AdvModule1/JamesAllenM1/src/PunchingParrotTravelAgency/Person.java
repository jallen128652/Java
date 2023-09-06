/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class Person {
//    member vars
    private String firstName;
    private String lastName;
//    default constructor
    Person(){
        firstName = "Default";
        lastName = "Default";
    }
//    2 arg constructor to pass vars to child
    Person(String firstName, String lastName){
        this.firstName = firstName;
        this.lastName = lastName;
    }
    
    
// setters and getters
    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }
    void display(){
        System.out.print(firstName + " " + lastName + " ");
    }
    
 
    
    
}
