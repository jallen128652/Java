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
//            if statements for type to setters
            if(hatType == 1) {
                customer.setHatType(hatType);
                System.out.println("Please choose a quantity: ");
                qty = input.nextInt();
                customer.setQty(qty);
            }else if(hatType == 2){
                customer.setHatType2(hatType);
                System.out.println("Please choose a quantity: ");
                qty = input.nextInt();
                customer.setQty2(qty);
            }else if(hatType == 3){
                customer.setHatType3(hatType);
                System.out.println("Please choose a quantity: ");
                qty = input.nextInt();
                customer.setQty3(qty);
            }
        }while(hatType != 4);
//        use the getters to get qty by type and complete the receipt
//        loop through the hats to determine the price per
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

//subtotal = qty * type
//tax = subtotal * rate not charged against shipping cost
//shipping determined by subtotal tax not accounted for just subtotal
//total = subtotal + tax + shipping

//main will store an arraylist of all orders objects