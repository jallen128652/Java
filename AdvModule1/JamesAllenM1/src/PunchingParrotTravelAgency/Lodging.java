/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class Lodging{
    String date;
    String lodgingType;
    String name;
    double basePricePerNight;
    

//   default constructor
    Lodging(){
//        default vals
        date = "Default";
        lodgingType = "Default";
        name = "Default";
        basePricePerNight = 150;
        
    }
//    overloaded constructor
    Lodging(String date, String lodgingType, String name, double basePricePerNight){
//        pulls vals from person
        this.date = date;
        this.lodgingType = lodgingType;
        this.name = name;
        this.basePricePerNight = basePricePerNight;        
    }
//  note no inheritance so no calls to super.toString()
    @Override
    public String toString(){
        return "Booking details: " +
               "\nTravel date: " + date +
               "\nLodging type: " + lodgingType + 
               "\nHotel name: " + name + 
               "\nNightly room price: $" + String.format("%.2f", basePricePerNight) + "\n";
    }
}
        