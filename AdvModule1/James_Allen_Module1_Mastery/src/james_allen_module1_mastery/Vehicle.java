/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package james_allen_module1_mastery;

/**
 *
 * @author druid
 */
public class Vehicle {
    int year;
    String make;
    String model;
    
//   default constructor
    Vehicle(){
//        default values
        year = 2023;
        make = "Ford";
        model = "Mustang";        
    }
//    3 arg constructor to pass vars
    Vehicle(int year, String make, String model){
        this.year = year;
        this.make = make;
        this.model = model;
    }
//    display method for the superclass
    void display(){
        System.out.println("Year: " + year);
        System.out.println("Make: " + make);
        System.out.println("Model: " + model);
    }
}

class Automobile extends Vehicle {
    int numSeats;
    boolean hasManualTrans;
    int towingCapacity;
// default constructor stores default vals  
    Automobile(){
        numSeats = 4;
        hasManualTrans = true;
        towingCapacity = 0;        
    }
//    multi arg constructor to pass vars
    Automobile(int year, String make, String model, int numSeats, boolean hasManualTrans,
            int towingCapacity){
//        pulls the vals from the super for these vars("inherits")
        super(year, make, model);
//        reference subclass var not inherited        
        this.numSeats = numSeats;
        this.hasManualTrans = hasManualTrans;
        this.towingCapacity = towingCapacity;
    }
    
    void display(){
//        calls for the superclass display fx
        super.display();
        System.out.println("Number of seats: " + numSeats);
        System.out.println("Has a manual transmission? " + hasManualTrans);
        System.out.println("Towing capacity: " + towingCapacity + "lbs");
    }
}

class Motorcycle extends Vehicle {
    int wheelCount;
    int engineSize;
// default constructor stores default vals
    Motorcycle(){
        wheelCount = 2;
        engineSize = 116;
    }
//    multi arg constructor to pass vars
    Motorcycle(int year, String make, String model, int wheelCount, int engineSize){
       //        pulls the vals from the super for these vars("inherits")
        super(year, make, model); 
//        reference subclass var not inherited
        this.wheelCount = wheelCount;
        this.engineSize = engineSize;
    }
    void display(){
//        calls for the superclass display fx
        super.display();
        System.out.println("Wheel count: " + wheelCount);
        System.out.println("Engine size: " + engineSize + "ci");
    }
}

class ChevroletCorvette extends Automobile {
//    this class lets us assign the values from a grandchild to inherited vars and
//    will have access to the parent display methods
   //    default constructor
    ChevroletCorvette(){
//        assign vals to the superclass vars
        super(2001, "Chevrolet", "C5 Corvette Z06", 2, true,
                1000);
    } 
}

class TeslaModel3 extends Automobile {
//    default constructor
    TeslaModel3(){
//        assign vals to the superclass vars
        super(2017, "Tesla", "Model 3 Long Range", 4, false,
                3000);
    }    
}

class HDSoftTail extends Motorcycle {
//    default constructor 
    HDSoftTail(){
//        assign vals to the superclass vars
        super(2006, "Harley Davidson", "Softail Night Train", 2, 96);
    }
}

class VictoryVegas8ball extends Motorcycle {
//    default constructor
    VictoryVegas8ball(){
//        assign vals to the superclass vars
        super(2016, "Victory", "Vegas 8-Ball", 2, 106);
    }    
}