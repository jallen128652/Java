/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class Customer extends Person {

    private String address;
    private String phoneNumber;
    String roomNumber;
    double balanceOwed;
    
//   default constructor
    Customer(){
//        default vals
        address = "Default";
        phoneNumber = "Default";
        roomNumber = "101a";
        balanceOwed = 150;
    }
//    overloaded constructor
    Customer(String firstName, String lastName, String loginName, String password,
            String address, String phoneNumber, String roomNumber, double balanceOwed){
//        pulls vals from person
        super(firstName, lastName, loginName, password);
//        reference subclass var not inherited 

        this.address = address;
        this.phoneNumber = phoneNumber;
        this.roomNumber = roomNumber;
        this.balanceOwed = balanceOwed;
    }

    @Override
    public String toString(){
//        calls the superclass toString() and adds subclass prints
//        note call to super must be the first thing AFTER the return not before on a toString() fx
        return super.toString() + " Welcome, login successful!\nAccount details:" + 
               "\nAddress: " + address +
               "\nPhone number: " + phoneNumber +
               "\nRoom number: " + roomNumber + 
               "\nBalance owed: $" + String.format("%.2f", balanceOwed) + "\n";
    }   
}
