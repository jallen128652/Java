/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//************From Professor Borden's YT Vids*********************
//            https://www.youtube.com/@alleyb62
package practice5;

/**
 *
 * @author druid
 */
public class inheritanceLab {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//Datatype referenceVar = new Constructor();
// assigns the var student to the Student object aka instantiation,
// constructor assembles the object and new stores a reference of it in 
// the student var location
// note we passed a value arg into the student obj
        Student student = new Student("Fred");
//        call subclass method using student obj
        student.display();
////        initializing variables of the superclass with the subclass obj(inheritance)
//        student.name = "Fred";
////        initializing variables of the subclass with the subclass obj(normal operation)
//        student.idNumber = 1;
////        calls the superclass method using the subclass instantiated obj(inheritance)
//        student.purchaseParkingPass();
    }
    
}
