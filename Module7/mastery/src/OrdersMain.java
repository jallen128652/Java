import java.util.*;
public class OrdersMain {
    public static void main(String[] args){

//        call fx for print menu inside do while loop first
//        input next
//        switch case for choice which calls fx's inside a do while loop
//        declare obj's
        ArrayList<Orders> orders = new ArrayList<>();
        Scanner input = new Scanner(System.in);
//        main menu
//        uses switch case to call fx's
        int choice;
        do{
//            calls the menu fx
           menu();
//           takes selection and calls the other class fx's
           choice = input.nextInt();
           switch(choice){
               case 1:
//                   note passes the arraylist as arg
                   orders(orders);
                   break;
               case 2:
                   salesTotals(orders);
                   break;
               case 3:
                   System.out.println("Exiting now.");
                   break;
               default:
                   System.out.println("Invalid choice input, try again.");
           }
        }while(choice != 3);

    }
//      menu fx
//      basic print job
    public static void menu(){
        System.out.println("Welcome to Party Hats!");
        System.out.println("Hat order menu:");
        System.out.println("1. Place an order.");
        System.out.println("2. Total the sales.");
        System.out.println("3. Exit.");
        System.out.println("Choose an option: ");
    }
//      order fx
    public static void orders(ArrayList<Orders> orders){
//        creates a customer object to be used in this fx for current order
        Orders customer = new Orders();
        int hatType, qty1, qty2, qty3;
        double subTotal, tax = 0.0825, subT1, subT2, subT3;
        double shipping = 0, total, taxes;
        double[][] hats = {{4.00, 3.75, 3.50, 3.25, 3.00},
                {4.50, 4.25, 4.00, 3.75, 3.50},
                {5.00, 4.75, 4.50, 4.25, 4.00}};

        System.out.println("Hat Prices\n");
        System.out.println("Price by qty/type    <10    |  10-25  |  26-49  |  50-100  | >100");
        Scanner input = new Scanner(System.in);
//        loops through rows to print out prices by quantity
        for(int a = 0; a < hats.length; ++a){
            if(a == 0){
                System.out.print("Kid's Ball Caps:\t ");
            }else if(a == 1){
                System.out.print("Woman's Sun Hats:\t ");
            }else if(a == 2){
                System.out.print("Men's Trucker Hats:\t ");
            }
//            loops through quantity price columns **nested inner**
            for(int b = 0; b < hats[a].length; ++b){
                System.out.print("$" + String.format("%.2f", hats[a][b]) + "     ");
            }
            System.out.println();
        }
        do {
            System.out.println("\n1. Order Kid's Ball Caps.");
            System.out.println("2. Order Woman's Sun Hats.");
            System.out.println("3. Order Men's Trucker Hats.");
            System.out.println("4. Complete the order.");
            System.out.println("Please choose an option: ");
            hatType = input.nextInt();
//            if statements for type/qty to setters
            if(hatType == 1) {
                System.out.println("Please choose a quantity: ");
                qty1 = input.nextInt();
//                stores the qty in the current customer obj
                customer.setQty(qty1);
            }else if(hatType == 2){
                System.out.println("Please choose a quantity: ");
                qty2 = input.nextInt();
                customer.setQty2(qty2);
            }else if(hatType == 3){
                System.out.println("Please choose a quantity: ");
                qty3 = input.nextInt();
                customer.setQty3(qty3);
            }
        }while(hatType != 4);
        int hat1QTY = 0, hat2QTY = 0, hat3QTY = 0;
        double priceEa1 = 0, priceEa2 = 0, priceEa3 = 0;
//        set qty's in Orders class
//        note object.classFx()
        hat1QTY = customer.getQty();
        hat2QTY = customer.getQty2();
        hat3QTY = customer.getQty3();
//     check the ranges and getting the priceEa
//      use a range match to search qty price columns from parallel arrays
        final int NUM_RANGES = 5;
        double[] range = {1, 10, 26, 50, 101};
        int sub1 = NUM_RANGES - 1;
        int sub2 = NUM_RANGES - 1;
        int sub3 = NUM_RANGES - 1;
        if(hat1QTY > 0) {
            while (sub1 >= 0 && hat1QTY < range[sub1]){
                --sub1;
            }
            priceEa1 = hats[0][sub1];
        }
        if(hat2QTY > 0) {
            while (sub2 >= 0 && hat2QTY < range[sub2]){
                --sub2;
            }
            priceEa2 = hats[1][sub2];
        }
        if(hat3QTY > 0) {
            while (sub3 >= 0 && hat3QTY < range[sub3]){
                --sub3;
            }
            priceEa3 = hats[2][sub3];
        }
//        run calcs
        subT1 = priceEa1 * hat1QTY;
        subT2 = priceEa2 * hat2QTY;
        subT3 = priceEa3 * hat3QTY;
        subTotal = subT1 + subT2 + subT3;
        taxes = subTotal * tax;
        if(subTotal < 10){
            shipping = 5.99;
        }else if (subTotal >= 10 && subTotal < 25){
            shipping = 9.99;
        } else if (subTotal >= 25 && subTotal < 50) {
            shipping = 15.99;
        }else if (subTotal >= 50){
            shipping = 0;
        }
        total = subTotal + taxes + shipping;
//        store total
        customer.setTotal(total);
//        print receipt
        System.out.println("Party Hats Sales Receipt\n");
        System.out.println(hat1QTY + " Kid's Ball Caps \t\t\t@ " + priceEa1 + " each: $ " +
                String.format("%.2f",subT1));
        System.out.println(hat2QTY + " Woman's Sun Hats \t\t\t@ " + priceEa2 + " each: $ " +
                String.format("%.2f",subT2));
        System.out.println(hat3QTY + " Men's Trucker Hats \t\t@ " + priceEa3 + " each: $ " +
                String.format("%.2f",subT3));
        System.out.println("Subtotal:\t\t\t$ " + String.format("%.2f",subTotal));
        System.out.println("Tax:\t\t\t\t$ " + String.format("%.2f",taxes));
        System.out.println("Shipping:\t\t\t$ " + String.format("%.2f",shipping));
        System.out.println("Total Due:\t\t\t$ " + String.format("%.2f",total));
        System.out.println("\n\n");
//      add to the arraylist
        orders.add(customer);
    }
// sales total arraylist fx
    public static void salesTotals(ArrayList<Orders> orders){
//        all 4 getters
//        when fx is called print qty by type and total sales amt
//        declare local vars to store getter values
        int hat1 = 0, hat2 = 0, hat3 = 0;
        double totals = 0;
//        for loop totals up the values in the array list by customer objects
        for(Orders customer : orders){
//            adds each customer obj in the array list
            hat1 += customer.getQty();
            hat2 += customer.getQty2();
            hat3 += customer.getQty3();
            totals += customer.getTotal();
        }
//        print daily report
        System.out.println("Total Sales for Today\n");
        System.out.println("Kid's Ball Caps:       " + hat1);
        System.out.println("Woman's Sun Hats:      " + hat2);
        System.out.println("Men's Trucker Hats:    " + hat3);
        System.out.println("Total Amount of Sales: $" + String.format("%.2f", totals));
        System.out.println("\n\n");
    }
}
//pseudocode for planning
//hats
//kids ball caps
//womens sun caps
//mens trucker hats
//if order < 10.00 shipping 5.99
//if order >= 10.00 && < 25.00 shipping 9.99
//if order >= 25.00 && < 50.00 shipping 15.99
//if order >= 50.00 shipping 0.00
//main menu choose action order, total, exit function
//need nested for loops to display pricing menu in the order option
//add a menu for the order page where they can choose hat type and quantity function
//need a receipt display function

//subtotal = qtyType * price
//tax = subtotal * rate not charged against shipping cost
//shipping determined by subtotal tax not accounted for just subtotal
//total = subtotal + tax + shipping

//main will store an arraylist of all daily orders objects