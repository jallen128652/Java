/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package practice5;

/**
 *
 * @author druid
 */
public class Student extends Person{
    int idNumber;
    float avgMark;
//    constructor. If you don't write one, there's already one provided by java
//     a constructor is a special method with no return type
//    This is a default constructor with no args and default values added
    Student(){
//    assign values to the member vars
// note these are default values
        idNumber = 0;
        avgMark = 4.0f;
    }
    //    overloaded constructor aka 2 constructors with the same name
    Student(String name){
//        super is a reference to the class one level up
//  super must be the first line inside the constructor if used
//  this call will set all the info from the parent overloaded constructor
        super(name);
//        adds the local or subclass vals
        idNumber = 0;
        avgMark = 4.0f;
    }
    boolean isEligibleToEnroll(){
        return true;
    }
    
//    test display method that will show the member vars and superclass display fx vars
    void display(){
//         call to Person class display() fx
        super.display();
        System.out.println("Id number: " + idNumber + "\nAverage mark: " + avgMark);
    }
}
