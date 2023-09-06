/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package james_allen_module1_mastery;

/**
 *
 * @author druid
 */
public class VehiclesMain {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
//        construct my grandchild obj references
        ChevroletCorvette c5Z06 = new ChevroletCorvette();
        TeslaModel3 model3Lr = new TeslaModel3();
        HDSoftTail nightrain = new HDSoftTail();
        VictoryVegas8ball vegas8Ball = new VictoryVegas8ball();
//        test display fx's
//        c5Z06.display(); 
//        model3Lr.display();
//        nightrain.display();
//        vegas8Ball.display();

//array to store my Vehicle class obj's
// instantiate the class array obj reference
        Vehicle[] models = new Vehicle[4];
//        initialize array with obj references
        models[0] = c5Z06;
        models[1] = model3Lr;
        models[2] = nightrain;
        models[3] = vegas8Ball;
        
//        for loop to call the display() for each obj
        System.out.println("Vehicles:\n");
        for(int i = 0; i < models.length; i++){
//            calls the array index obj reference display() fx
            models[i].display();
//            add some space for readability
            System.out.println("");
        }
    }    
}
