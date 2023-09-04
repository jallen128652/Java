/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */

//************From Professor Borden's YT Vids*********************
//            https://www.youtube.com/@alleyb62
package practice6;

/**
 *
 * @author druid
 */
public class Inheritance {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        instantiate a sword obj and pass values to replace the default Sword values
        Sword sword = new Sword("Black Sword", 25.99f, 123);
//        call the Sword display method
// note sword doesn't have a display method, but it has acesss to the Weapon display
// method and to it's own values
        sword.display();
    }
    
}
