import java.util.*;
public class OrdersMain {
    public static void main(String[] args){

//        call fx for print menu inside do while loop first
//        input next
//        switch case for choice which calls fx's inside a do while loop
        Scanner input = new Scanner(System.in);
        int choice;
        do{
           menu();
           choice = input.nextInt();
           switch(choice){
               case 1:
                   orders();
                   break;
               case 2:
                   salesTotals();
                   break;
               case 3:
                   System.out.println("Exiting now.");
                   break;
               default:
                   System.out.println("Invalid choice input, try again.");
           }
        }while(choice != 3);

    }
// menu fx
    public static void menu(){
        System.out.println("Welcome to Party Hats!");
        System.out.println("Hat order menu:");
        System.out.println("1. Place an order.");
        System.out.println("2. Total the sales.");
        System.out.println("3. Exit.");
        System.out.println("Choose an option: ");
    }
// order fx
    public static void orders(){
        Orders customer = new Orders();
        int hatType = 0, qty;
        double[][] hats = {{4.00, 3.75, 3.50, 3.25, 3.00},
                {4.50, 4.25, 4.00, 3.75, 3.50},
                {5.00, 4.75, 4.50, 4.25, 4.00}};

        System.out.println("Hat Prices\n");
        System.out.println("Price by qty/type    <10    |  10-25  |  26-49  |  49-100  | >100");
        Scanner input = new Scanner(System.in);
        for(int a = 0; a < hats.length; ++a){
            if(a == 0){
                System.out.print("Kid's Ball Caps:\t ");
            }else if(a == 1){
                System.out.print("Woman's Sun Hats:\t ");
            }else if(a == 2){
                System.out.print("Men's Trucker Hats:\t ");
            }
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
                qty = input.nextInt();
                customer.setQty(qty);
            }else if(hatType == 2){
                System.out.println("Please choose a quantity: ");
                qty = input.nextInt();
                customer.setQty2(qty);
            }else if(hatType == 3){
                System.out.println("Please choose a quantity: ");
                qty = input.nextInt();
                customer.setQty3(qty);
            }
        }while(hatType != 4);
        int hat1QTY = 0, hat2QTY = 0, hat3QTY = 0;
        double priceEa1 = 0, priceEa2 = 0, priceEa3 = 0;
        int rng1 = 0, rng2 = 0, rng3 = 0;
        hat1QTY = customer.getQty();
        hat2QTY = customer.getQty2();
        hat3QTY = customer.getQty3();
//     check the ranges and getting the priceEa
//      use a range match
        final int NUM_RANGES = 5;
        double[] range = {9, 25, 49, 100, 5000};
        int sub = NUM_RANGES - 1;
        if(hat1QTY > 0) {
            while (sub >= 0 && hat1QTY < range[sub]){
                --sub;
            }
            priceEa1 = hats[0][sub];
        }
        if(hat2QTY > 0) {
            while (sub >= 0 && hat2QTY < range[sub]){
                --sub;
            }
            priceEa2 = hats[1][sub];
        }
        if(hat3QTY > 0) {
            while (sub >= 0 && hat3QTY < range[sub]){
                --sub;
            }
            priceEa3 = hats[2][sub];
        }
        System.out.println(hat1QTY + " " + priceEa1);
        System.out.println(hat2QTY + " " + priceEa2);
        System.out.println(hat3QTY + " " + priceEa3);

//        calc subtotal
    }


// sales total arraylist fx
    public static void salesTotals(){

    }

}
//pseudocode for planning
//hats
//kids ball caps
//womens sun caps
//mens trucker hats
//if order < 10.00 shipping 8.00
//if order >= 10.00 && < 25.00 shipping 15.00
//if order >= 25.00 && < 50.00 shipping 22.00
//if order >= 50.00 shipping 0.00
//main menu choose action order, total, exit function
//need nested for loops to display pricing menu in the order option
//add a menu for the order page where they can choose hat type and quantity function
//need a receipt display function

//subtotal = qtyType * price
//tax = subtotal * rate not charged against shipping cost
//shipping determined by subtotal tax not accounted for just subtotal
//total = subtotal + tax + shipping

//main will store an arraylist of all orders objects