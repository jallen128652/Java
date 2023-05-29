import javax.swing.JOptionPane;

public class WidgetOrders {
    public static void main(String[] args)
    {
        String strQuantity;
        int quantity;
        double total, cost = 5.95;

        strQuantity = JOptionPane.showInputDialog(null, "Widgets are $5.95 each. How many would you like?", "Enter quantity here");
        quantity = Integer.parseInt(strQuantity);
        total = quantity * cost;

        JOptionPane.showMessageDialog(null, "Your total is $" + String.format("%.2f", total));
    }
}
