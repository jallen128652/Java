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
            Customer customer = new Customer("jim", "allen", "ji45", "Pu##45",
                    "99 Hold st. Temple, TX 76502", "255-555-5555");

//            call to display
            customer.display();      


//            obj reference to LodgingReview
            LodgingReview custRating = new LodgingReview(1, "The room smelled like cigarrettes and mold, breakfast was good though.");               
            
            custRating.display();

            
    }
        
    
    
}
