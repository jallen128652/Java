/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
// OrderDetails is a Person in the sense that a Person is an account used in this context
public class OrderDetails extends Person{
    String roomNumber;
    double balanceOwed;
    double totalSpending;
    double parkingFee;    

//  default constructo
    OrderDetails(){
//    default values
        roomNumber = "101a";
        balanceOwed = 150;
        totalSpending = 155;
        parkingFee = 5;
    }
//    overloaded constructor
    OrderDetails(String firstName, String lastName, String roomNumber, double balanceOwed,
            double totalSpending, double parkingFee){
//        calls to super 
        super(firstName, lastName);
//        reference vars to the current obj assigning it the class var vals
        this.roomNumber = roomNumber;
        this.balanceOwed = balanceOwed;
        this.totalSpending = totalSpending;
        this.parkingFee = parkingFee;
    }
//    override toString()
    @Override
    public String toString(){
//        note call to super must be the first thing AFTER the return not before on a toString() fx
        return super.toString() + " order information: " + 
               "\nRoom number: " + roomNumber +
               "\nRoom charges: $" + String.format("%.2f", totalSpending) +
               "\nParking fee: $" + String.format("%.2f", parkingFee) + 
               "\nTotal owed: $" + String.format("%.2f", balanceOwed) + "\n";
    }        
}
