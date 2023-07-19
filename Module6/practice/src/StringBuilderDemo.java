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

        String string1 = "happay";
        String string2 = "happay";
        if (string1.equals(string2)){
            System.out.println("equal");
        } else {
            System.out.println("not equal");
        }
    }
}
//for comparing the contents of two stringBuilder objects:
// obj1.toString().equals(obj2.toString());
//for comparing String contents: string1.equals(string2);
//can also use equalsIgnoreCase();

// the stringBuilder obj's must be converted to Strings

//additional StringBuilder class methods: append() and insert()
//example:
//StringBuilder phrase = new StringBuilder("Happy");
//phrase.append(" birthday");
// the object phrase now holds Happy Birthday
// append inserts at the end. insert() accepts args for position num
// example: phrase.insert(6, "30th ")
// new output would be Happy 30th birthday
// can also phrase.setCharAt(6, '4") which changes it to:
//Happy 40th birthday
// to extract a StringBuilder character you can use the phrase.charAt()
// example char letter = phrase.charAt(0);
//printing the letter var would print 'H'
//exceeding the index numbers for the StringBuilder object would result in
//syntax error.
