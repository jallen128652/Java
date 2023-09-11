/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
//Header: 
//  class: adv java
//  section: INEW 2338 7p1
//  Assignment: Module1 Mastery
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */

public class LodgingBookingMain {
//    main
    public static void main(String[] args){       
//        object reference constructors            
//            the lodging 5
//              HouseOrHome class vars: String date, String lodgingType, String name, double basePricePerNight, int numberBedrooms,
//            boolean jacuziOrPool, boolean laundryOnSite
            HouseOrHome traveler1 = new HouseOrHome("20231225", "House", "Wimbley House", 175, 5,
                    false, true);
            HouseOrHome traveler2 = new HouseOrHome("20231131", "House", "Haunted House", 50, 20,
                    false, false);
            HouseOrHome traveler3 = new HouseOrHome("20230908", "House", "Riverwalk House", 300, 4,
                    true, true);
//              Hotel class vars: String date, String lodgingType, String name, double basePricePerNight, int numberBeds, boolean hasFreeBreakfast,
//            boolean valetParking, double parkingFee, int vacancies, boolean hasPool, boolean hasGym, boolean laundryOnSite
            Hotel traveler4 = new Hotel("20230911", "Hotel", "Motel6", 90, 1, true,
                    false, 0, 10, true, false, true);
            Hotel traveler5 = new Hotel("20230930", "Hotel", "Grand Hyatt", 190, 1, false,
                    true, 20, 25, true, true, true);
            
//        call to display the toString() fx's
//            the lodging 5
            System.out.println(traveler1.toString());
            System.out.println(traveler2.toString());
            System.out.println(traveler3.toString());
            System.out.println(traveler4.toString());
            System.out.println(traveler5.toString());  
    }
}
