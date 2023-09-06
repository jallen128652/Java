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
        String name;
        TravelAgencyEmployee employee = new TravelAgencyEmployee();
//        input obj reference
        Scanner input = new Scanner(System.in);
        System.out.println("Enter employee name: ");
        name = input.nextLine();
        employee.setName(name);
        
    }
    
}
