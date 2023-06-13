public class Signs {
    //Declarations section.
    // Declare your variables and constants in this section.
    //Variables and constants declared here can be seen and used by all the functions in this class
    //Variables and constants declared here need to be private and do not need the keyword static.
    private String strMessage;
    private int quantity;
    private int imageQuantity;

    private final double TAXRATE = .0825; //This is an example of how to declare the private constants
    private final double BASECOST = 45.99;
    private final double IMG = 2.99;
    private final double LETTER = 1.99;
    //Public functions go here. Public functions in a class do not need the keyword static.

    public void printReceipt(String message){
        //This function will calculate the costs for 1 sign with the charge for extra letters plus tax.
        //It will print out a detailed receipt that includes the message to be printed on the sign, the price for 1 sign,
        //the price for extra letters, the charge for the extra letters, a subtotal, the tax amount to be charged, and total amount due.
        //All currency must be formatted to 2 decimal places and include a dollar sign.
//        variables
        double subTotal;
        double chars;
        double taxes;
        double charCharge;
        double total;
//        expressions
//        keeps from having a negative charge
        chars = message.replace(" ", "").length() - 10;
        if (chars > 0) {
            charCharge = chars * LETTER;
        } else {
            charCharge = 0.00;
        }
        subTotal = BASECOST + charCharge;
        taxes = subTotal * TAXRATE;
        total = subTotal + taxes;
//        outputs
        System.out.println("Receipt from JP's Custom signs for your sign order.");
        System.out.println("Your sign message: " + message);
        System.out.println("Base cost for the sign $" + BASECOST);
        System.out.println("Price for each additional letter $" + LETTER);
        System.out.println("Charge for your additional letters $" + String.format("%.2f", charCharge));
        System.out.println("Sub Total for your order $" + String.format("%.2f", subTotal));
        System.out.println("Taxes $" + String.format("%.2f", taxes));
        System.out.println("Total amount due $" + String.format("%.2f", total) + "\n");



    }

    public void printReceipt(String message, int quantity){
        //This function will calculate the costs of multiple signs with the charge for extra letters plus tax.
        //It will print out a detailed receipt that includes the message to be printed on the sign, the price for 1 sign,
        //the price for extra letters, the charge for the extra letters, a subtotal, the tax amount to be charged, and total amount due.
        //All currency must be formatted to 2 decimal places and include a dollar sign.
//        variables
        double subTotal;
        double chars;
        double taxes;
        double charCharge;
        double total;
        double signCost;
//        expressions
        signCost = BASECOST * quantity;
        chars = message.replace(" ", "").length() - 10;
//        keeps from having a negative charge
        if (chars > 0) {
            charCharge = chars * LETTER;
        } else {
            charCharge = 0.00;
        }
        subTotal = signCost + charCharge;
        taxes = subTotal * TAXRATE;
        total = subTotal + taxes;
//        outputs
        System.out.println("Receipt from JP's Custom signs for your sign order.");
        System.out.println("Your sign message: " + message);
        System.out.println("Base cost for the sign $" + BASECOST);
        System.out.println("Cost for the " + quantity + " signs ordered $" + String.format("%.2f", signCost));
        System.out.println("Price for each additional letter $" + LETTER);
        System.out.println("Charge for your additional letters $" + String.format("%.2f", charCharge));
        System.out.println("Sub Total for your order $" + String.format("%.2f", subTotal));
        System.out.println("Taxes $" + String.format("%.2f", taxes));
        System.out.println("Total amount due $" + String.format("%.2f", total) + "\n");

    }

    public void printReceipt(String message, int quantity, int imageQuantity) {
        //This function will calculate the costs of multiple signs with the charge for extra letters and extra images plus tax.
        //It will print out a detailed receipt that includes the message to be printed on the sign, the price for 1 sign,
        //the price for extra letters, the charge for the extra letters, the price for extra images, the charge for extra images,
        // a subtotal, the tax amount to be charged, and total amount due.
        //All currency must be formatted to 2 decimal places and include a dollar sign.
//        variables
        double subTotal;
        double chars;
        double taxes;
        double charCharge;
        double total;
        double signCost;
        double imagesCost;
//        expressions
        signCost = BASECOST * quantity;
        chars = message.replace(" ", "").length() - 10;
//        keeps from having a negative charge
        if (chars > 0) {
            charCharge = chars * LETTER;
        } else {
            charCharge = 0.00;
        }
        if (imageQuantity > 1) {
            imagesCost = (imageQuantity - 1) * IMG;
        } else {
            imagesCost = 0.00;
        }
        subTotal = signCost + charCharge + imagesCost;
        taxes = subTotal * TAXRATE;
        total = subTotal + taxes;
//        outputs
        System.out.println("Receipt from JP's Custom signs for your sign order.");
        System.out.println("Your sign message: " + message);
        System.out.println("base cost for the sign $" + BASECOST);
        System.out.println("Cost for the " + quantity + " signs ordered $" + String.format("%.2f", signCost));
        System.out.println("Price for each additional letter $" + LETTER);
        System.out.println("Charge for your additional letters $" + String.format("%.2f", charCharge));
        System.out.println("Price for each additional image $" + IMG);
        System.out.println("Charge for your additional images $" + String.format("%.2f", imagesCost));
        System.out.println("Sub Total for your order $" + String.format("%.2f", subTotal));
        System.out.println("Taxes $" + String.format("%.2f", taxes));
        System.out.println("Total amount due $" + String.format("%.2f", total) + "\n");
    }
}

