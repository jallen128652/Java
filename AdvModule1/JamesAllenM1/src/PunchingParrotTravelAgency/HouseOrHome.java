/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class HouseOrHome extends Lodging{
    int numberBedrooms;
    boolean jacuziOrPool;
    boolean laundryOnSite;   
//    default constructor
    HouseOrHome(){
//        default vals
        numberBedrooms = 2;
        jacuziOrPool = false;
        laundryOnSite = true;
    }
//    overloaded constructor
    HouseOrHome(String date, String lodgingType, String name, double basePricePerNight, int numberBedrooms,
            boolean jacuziOrPool, boolean laundryOnSite){
//        call to super
            super(date, lodgingType, name, basePricePerNight);
//        reference subclass vars not inherited
            this.numberBedrooms = numberBedrooms;
            this.jacuziOrPool = jacuziOrPool;
            this.laundryOnSite = laundryOnSite;        
    }
//    toString() with override of Lodging.toString()
    @Override
    public String toString(){
//        note call to super must be the first thing AFTER the return not before on a toString() fx
        return super.toString() + 
               "Number of bedrooms: " + numberBedrooms +
               "\nHouse has a Jacuzzi or Spa? " + jacuziOrPool +
               "\nHouse has Washer and Dryer? " + laundryOnSite + "\n";
    }    
}
