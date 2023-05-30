// import utility library
import java.util.Scanner;
// class name
public class PlantWorld1 {
//    main function or method
    public static void main(String[] args) {
        System.out.println("Welcome to Plant World! Home of the best succulents!");
//      variables
        int plants, cases, singles;
        double priceCase, priceSingle, costCases, costSingles, subtotal, taxRate, taxes, total;
        priceCase = 36.99;
        priceSingle = 1.99;
        taxRate = 0.0825;
//      input
        Scanner input = new Scanner(System.in);
        System.out.println("Cases of 24 succulents are $" + priceCase + " and single succulent plants are only $" + priceSingle + "!");
        System.out.println("Please enter how many succulent plants you want: ");
        plants = input.nextInt();
//      logic
        cases = (int) ((double) plants / 24);
        singles = plants % 24;
        costCases = cases * priceCase;
        costSingles = singles * priceSingle;
        subtotal = costCases + costSingles;
        taxes = subtotal * taxRate;
        total = subtotal + taxes;
//      output
        System.out.println("Total number of succulents ordered: " + plants);
        System.out.println(cases + " cases @ $36.99 each = $" + costCases);
        System.out.println(singles + " singles @ $1.99 each = $" + costSingles);
        System.out.println("Subtotal: $" + String.format("%.2f", subtotal));
        System.out.println("Tax: $" + String.format("%.2f", taxes));
        System.out.println("Total amount due: $" + String.format("%.2f", total));
        System.out.println("Thank you for shopping with us!");
    }
}

