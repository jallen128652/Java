/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class HotelRoom{
    String checkIn;
    String checkOut;
    String wifiPw; 
//    default constructor
    HotelRoom(){
//        default values
        checkIn = "1:00pm";
        checkOut = "11:00am";
        wifiPw = "PUnchParrots**1234";
    }
//    overloaded constructor
    HotelRoom(String checkIn, String checkOut, String wifiPw){
//        reference vars to the current obj assigning it the class var vals
        this.checkIn = checkIn;
        this.checkOut = checkOut;
        this.wifiPw = wifiPw;
    }
//  note no inheritance so no calls to super.toString()
    @Override
    public String toString(){
        return "Your check in time is: " + checkIn +
               "\nYour check out time is: " + checkOut + 
               "\nThe wifi password is: " + wifiPw + "\n";
    }
}

