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
        int empOrCust;
 //        input obj reference
        Scanner input = new Scanner(System.in);
//        choose person type
        System.out.println("Enter 1 for employee or 2 for customer >> ");
        empOrCust = input.nextInt();
        input.nextLine();
//        control structure for selection
        if(empOrCust == 1){        
//        employee object reference
        TravelAgencyEmployee employee = new TravelAgencyEmployee();

        System.out.println("Enter employee first name: ");
        firstName = input.nextLine();
        employee.setFirstName(firstName); 
        System.out.println("Enter employee last name: ");
        lastName = input.nextLine();
        employee.setLastName(lastName);
//        call to display
        employee.display();
        }else if(empOrCust == 2){
            Customer customer = new Customer();
        }
        
    }
    
}
