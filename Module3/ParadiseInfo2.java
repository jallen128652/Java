import java.util.Scanner;

public class ParadiseInfo2 {
    public static void main(String[] args) {
        double price;
        double discount;
        double savings; // return variable
        Scanner keyboard = new Scanner(System.in);
//      input variable 1
        System.out.print("Enter cutoff price for discount: ");
        price = keyboard.nextDouble();
//      input variable 2
        System.out.print("Enter discount rate as a whole number: ");
        discount = keyboard.nextDouble();
//      pass 2 variable to method and call method
        savings = computeDiscountInfo(price, discount);

        System.out.println("Special this week on any service over " + price);
        System.out.println("Discount of " + discount + " percent");
        System.out.println("That's a savings of at least $" + savings); // variable after return
    }
//    method that calculates a value to be returned to main
    public static double computeDiscountInfo(double price, double discountRate) {
        double savings; // local variable for the return
        savings = price * discountRate / 100;
        return savings; // returns this value to the original variable and ends the method
    }
}
