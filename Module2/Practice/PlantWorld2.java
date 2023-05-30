// import library
import javax.swing.JOptionPane;
public class PlantWorld2 {
    public static void main(String[] args) {
        //      variables
        int plants, singles;
        double priceCase, priceSingle, costCases, costSingles, subtotal, taxRate, taxes, total;
        priceCase = 36.99;
        priceSingle = 1.99;
        taxRate = 0.0825;
        //      input
        plants = Integer.parseInt(JOptionPane.showInputDialog(" Welcome to Plant World! Home of the best succulents!\n " +
                "Cases of 24 succulents are $" + priceCase + " and single succulent plants are only $" + priceSingle +
                "! \n How many would you like?"));

        //      logic
        int cases = (int) ((double) plants / 24);
        singles = plants % 24;
        costCases = cases * priceCase;
        costSingles = singles * priceSingle;
        subtotal = costCases + costSingles;
        taxes = subtotal * taxRate;
        total = subtotal + taxes;
        //       output
        JOptionPane.showMessageDialog(null, "Total number of succulents ordered: " + plants + "\n" +
                cases + " cases @ $36.99 each = $" + costCases + "\n" + singles + " singles @ $1.99 each = $" + costSingles + "\n" +
                "Subtotal: $" + String.format("%.2f", subtotal) + "\n" + "Tax: $" + String.format("%.2f", taxes) + "\n" +
                "Total amount due: $" + String.format("%.2f", total) + "\n" + "Thank you for shopping with us!");
    }
}
