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
        Student student = new Student();
//        initializing variables of the superclass with the subclass obj(inheritance)
        student.name = "Fred";
//        initializing variables of the subclass with the subclass obj(normal operation)
        student.idNumber = 1;
//        calls the superclass method using the subclass instantiated obj(inheritance)
        student.purchaseParkingPass();
    }
    
}
