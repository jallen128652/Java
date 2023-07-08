import java.util.Scanner;
public class StoreMain {
    public static void main(String[] args) {
//    instantiate Store class with new customer object
        Store customer = new Store();
        Scanner input = new Scanner(System.in);

//    declare variables
        String customerName;
        int numItems;
//    initial output greeting
        System.out.println("Welcome to Jim's Fidget Spinners!");
        System.out.println("We sell Fidget Spinners for only $6.99+tax!");
        System.out.println("Please enter your name");
//        declare and initialize variable name with and add to input stream
        customerName = input.nextLine();
//        call and set name using object of the class
//        object.setSubclassFx(var)
        customer.setName(customerName);
//        input for qty
        System.out.println("How many Fidget Spinners would you like to buy?");
        numItems = input.nextInt();
//        call subclassFx from main
//        note the call uses the object.subclassFX(var) format
        customer.calcOwes(numItems);
//        call mainClassFx from main class
//        note the object and the passed in main class variable
        receipt(customer, numItems);
    }
    public static void receipt(Store customer, int numItems){
//        local variables to store the values pulled from the Store class
        String name;
        double subTotal, tax, total;
        name = customer.getName();
//        initialize the variables using the object.getSubclassFx() calls
        subTotal = customer.getSubtotal();
        tax = customer.getTax();
        total = customer.getTotal();
        System.out.println("Jim's Fidget Spinners");
        System.out.println(name + " purchased " + numItems +
                " Fidget Spinners at $6.99 each.");
        System.out.println("Subtotal: $" + String.format("%.2f", subTotal));
        System.out.println("Tax due: $" + String.format("%.2f", tax));
        System.out.println("Total due: $" + String.format("%.2f", total));
        System.out.println("Thank you for your business!");
    }
}
