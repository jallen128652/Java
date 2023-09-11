/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class OrderDetails extends Customer{
    double totalSpending;
    double parkingFee;    

//  default constructo
    OrderDetails(){
//    default values

        totalSpending = 155;
        parkingFee = 5;
    }
//    overloaded constructor
    OrderDetails(String firstName, String lastName, String roomNumber, double balanceOwed,
            double totalSpending, double parkingFee){
//        calls to super and assign values
        super("Jon", "Jones", "JJ123", "JJones&&123", "18 Old oak trl. Waco TX. 76555", "254-555-5555", "305b", 150);
//        reference vars to the current obj assigning it the class var vals
        this.totalSpending = totalSpending;
        this.parkingFee = parkingFee;
    }
//    override toString()
    @Override
    public String toString(){
//        note call to super must be the first thing AFTER the return not before on a toString() fx
        return super.toString() + " order information: " + 
               "\nRoom charges: $" + String.format("%.2f", totalSpending) +
               "\nParking fee: $" + String.format("%.2f", parkingFee) + "\n";
    }        
}
