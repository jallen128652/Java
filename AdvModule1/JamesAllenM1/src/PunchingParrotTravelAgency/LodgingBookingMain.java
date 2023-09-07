/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */

public class LodgingBookingMain {
//    main
    public static void main(String[] args){
//        local vars

 //        input obj reference
       
//        employee object reference
            TravelAgencyEmployee employee = new TravelAgencyEmployee("Jane", "Doe", 123,
                    "20230907", 1500, false);

    //        call to display
            employee.display();
            
//            obj reference to customer
            Customer customer = new Customer("Jon", "Doe", "ji45", "Pu##45",
                    "99 Hold st. Middle, TX 76533", "255-555-5555");

//            call to display
            customer.display();      


//            obj reference to LodgingReview
            LodgingReview custRating = new LodgingReview(1, "The room smelled like cigarrettes and mold, breakfast was good though.");               
            
            custRating.display();

// finish out the lodgings, change all display() to toString() and add formatting add the calls. remove the display calls. ensure all subclasses override superclass toString()           
    }
        
    
    
}
