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
//        employee object reference
        TravelAgencyEmployee employee = new TravelAgencyEmployee();
//        input obj reference
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee first name: ");
        firstName = input.nextLine();
        employee.setFirstName(firstName); 
        System.out.println("Enter employee last name: ");
        lastName = input.nextLine();
        employee.setFirstName(lastName);
    }
    
}
