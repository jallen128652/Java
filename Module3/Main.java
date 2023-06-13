import java.util.Scanner;

public class Main {

    //This is the global scope section of the program. Global variablesAll variables and constants declared here can be seen and used by the entire program.
    //DO NOT declare variables and constants in this section.

    public static void main(String[] args) {
        //Declarations section. Declare the variables and constants you will need in this section.
        String strMessage;
        int quantity;
        int imageQuantity;


        Signs signOrder = new Signs(); //This creates an object of the Signs class. DO NOT MODIFY.

        // Print a welcome message that includes prices for the user to see. Make it look good. DO NOT print it on 1 line.
        System.out.println("Welcome to JP's Custom signs");
//        System.out.println("Base cost for a sign is $" + baseCost);
        System.out.println("Base cost for a sign is $45.99");
//        System.out.println("Each sign comes with 1 image, additional images are $" + img);
        System.out.println("Each sign comes with 1 image, additional images are $2.99");
//        System.out.println("Each sign is allotted 10 text characters, each additional letter is $" + letter);
        System.out.println("Each sign is allotted 10 letters, each additional letter is $1.99");

        //Ask the user what message they want printed on their sign.
        Scanner sign = new Scanner(System.in);
        System.out.println("Enter the message you want on your sign: ");
        strMessage = sign.nextLine();

        // Asking the user how many signs they want
        System.out.println("How many signs do you want? ");
        quantity = sign.nextInt();

        // Asking the user how many images they want on their sign(s)
        System.out.println("How many images do you want? ");
        imageQuantity = sign.nextInt();

        // Call the 3 overloaded methods from the Sign class using the "signOrder" object.
        //DO NOT MODIFY the following 3 lines of code.
        signOrder.printReceipt(strMessage);
        signOrder.printReceipt(strMessage, quantity);
        signOrder.printReceipt(strMessage, quantity, imageQuantity);

//        this commented out section is if you wanted to call only one of the overloaded methods based on user selection
//        it did not call for that in the lesson, just wanted to see if it worked.

//        if (quantity == 1){
//            signOrder.printReceipt(strMessage);
//        } else if (quantity > 1){
//            signOrder.printReceipt(strMessage, quantity);
//        } else if (imageQuantity > 1)
//        signOrder.printReceipt(strMessage, quantity, imageQuantity);

    }
}
