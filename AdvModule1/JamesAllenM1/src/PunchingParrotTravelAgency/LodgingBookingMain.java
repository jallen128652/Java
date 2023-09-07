/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package PunchingParrotTravelAgency;

/**
 *
 * @author druid
 */
import java.util.*;

public class LodgingBookingMain {
//    main
    public static void main(String[] args){
//        local vars
        String firstName;
        String lastName;
        String loginName;
        String password;
        int empOrCust;
 //        input obj reference
        Scanner input = new Scanner(System.in);
//        choose person type
        System.out.println("Enter 1 for employee, 2 for customer account or 3 to book lodging >> ");
        empOrCust = input.nextInt();
//        clear input stream
        input.nextLine();
//        control structure for selection
//****************break these out into local methods and the calls inside the control structure**************************
        if(empOrCust == 1){        
//        employee object reference
            TravelAgencyEmployee employee = new TravelAgencyEmployee();

            System.out.println("Enter employee first name >> ");
            firstName = input.nextLine();
            employee.setFirstName(firstName); 
            System.out.println("Enter employee last name >> ");
            lastName = input.nextLine();
            employee.setLastName(lastName);
    //        call to display
            employee.display();
        }else if(empOrCust == 2){
            int detailsOrReview;
            Customer customer = new Customer();
            System.out.println("Enter first name >> ");
            firstName = input.nextLine();
            customer.setFirstName(firstName);
            System.out.println("Enter last name >> ");
            lastName = input.nextLine();
            customer.setLastName(lastName);
            System.out.println("Enter username >> ");
            loginName = input.nextLine();
            customer.setLoginName(loginName);
            System.out.println("Enter password >> ");
            password = input.nextLine();
            customer.setPassword(password);
//            call to display
            customer.display();      
            
//        calls the hotel.display or LodgingReview class
            System.out.println("Would you like your room details or to leave a review?\n Enter 1 for room details or 2 for review");
            int rating;
            String comments;
            detailsOrReview = input.nextInt();
//*********************break these out into local methods with the calls inside the control structure*************************
            if(detailsOrReview == 1){
                HotelRoom.display();                
            }else{
//                obj reference to LodgingReview
                LodgingReview custRating = new LodgingReview();
                System.out.println("Please enter how many stars you rated your stay: 1-5"); 
                rating = input.nextInt();
                custRating.setRating(rating);
//                clear input stream
                input.nextLine();
                System.out.println("Please provide any comments about your stay with us: ");
                comments = input.nextLine();
                custRating.setComments(comments);
                System.out.println("We value your feedback!");
                System.out.println("Your rating:");
                System.out.println(custRating.getRating() + "stars");
                System.out.println("Comments:\n" + custRating.getComments());                
            }

        }else if(empOrCust == 3){
            
        }
        
    }
    
}
