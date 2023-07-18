import javax.swing.JOptionPane;
public class StringBuilderDemo {
    public static void main(String[] args){
//        class       objectName = new instance of class("String")
        StringBuilder nameString = new StringBuilder("Barbara");
//        int that stores object.capacity(); note object.non-staticMethod()
        int nameStringCapacity = nameString.capacity();
        System.out.println("Capacity of nameString is " +
                nameStringCapacity);
//        the following 2 lines can be joined in this format:
//        Class objectName = new Class("String data");
//        declare a new class object and initialize as null
        StringBuilder addressString = null;
//        create an instance of the object and store String data
        addressString = new StringBuilder("6311 Hickory Nut Grove Road");
//        int that stores object.capacity(); note object.non-staticMethod()
        int addStringCapacity = addressString.capacity();
//        note the object.nonStaticMethod(arg)
        System.out.println("Capacity of addressString is " +
                addStringCapacity);
        nameString.setLength(20);
        System.out.println("The address is " + addressString);
    }
}
