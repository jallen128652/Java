/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
public class Hotel extends Lodging{
    int numberBeds;
    boolean hasFreeBreakfast;
    boolean valetParking;
    double parkingFee;
    int vacancies;
    boolean hasPool;
    boolean hasGym;
    boolean laundryOnSite;
//    default constructor
    Hotel(){
//        default vals
        numberBeds = 1;
        hasFreeBreakfast = false;
        valetParking = false;
        parkingFee = 5;
        vacancies = 1;
        hasPool = false;
        hasGym = false;
        laundryOnSite = false;
    }
    //    overloaded constructor
    Hotel(String date, String lodgingType, String name, double basePricePerNight, int numberBeds, boolean hasFreeBreakfast, boolean valetParking,
            double parkingFee, int vacancies, boolean hasPool, boolean hasGym, boolean laundryOnSite){
//        call to super
            super(date, lodgingType, name, basePricePerNight);
//        reference subclass vars not inherited
            this.numberBeds = numberBeds;
            this.hasFreeBreakfast = hasFreeBreakfast;
            this.valetParking = valetParking;
            this.parkingFee = parkingFee;
            this.vacancies = vacancies;
            this.hasPool = hasPool;
            this.hasGym = hasGym;
            this.laundryOnSite = laundryOnSite;
    }
//    toString() with override of Lodging.toString()
    @Override
    public String toString(){
//        note call to super must be the first thing AFTER the return not before on a toString() fx
        return super.toString() +
                "Number of beds: " + numberBeds +
                "\nComplimentary breakfast? " + hasFreeBreakfast +
                "\nValet parking? " + valetParking + 
                "\nThe parking fee is: $" + String.format("%.2f", parkingFee) +
                "\nAvailable vacancies: " + vacancies +
                "\nPool on-site? " + hasPool +
                "\nGym on-site? " + hasGym +
                "\nLaundromat on-site? " + laundryOnSite + "\n";
    }
}
