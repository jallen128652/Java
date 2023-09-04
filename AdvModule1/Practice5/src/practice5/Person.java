/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author druid
 */
public class Person {
    String name;
    String address;
    String phone;
    String email;
    
    //    constructor. If you don't write one, there's already one provided by java
//     a constructor is a special method with no return type
//    This is a default constructor with no args and default values added
    Person (){
//    assign values to the member vars
// note these are default values
        name = "Default";
        address = "Default";
        phone = "555-555-5555";
        email = "no email provided";
    }
//    overloaded constructor aka 2 constructors with the same name
    Person(String name){
//        this.classVar = argVar
// "this" is a reference to the current obj we're working with
        this.name = name;
//        just so the fields aren't empty
        address = "Default";
        phone = "555-555-5555";
        email = "no email provided";
    }
//    note this will be called from Student display() fx
    void display(){
        System.out.println("Name: " + name + "\nAddress: " + address +
                 "\nPhone: " + phone + "\nEmail: " + email);
    }
    
   void purchaseParkingPass(){
       System.out.println("Parking pass purchased");
   } 
    
}
