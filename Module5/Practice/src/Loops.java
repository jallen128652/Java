import java.util.Scanner;
public class Loops {
    public static void main(String[] args){
//        while loop that prints 1 to 20
        var num1 = 0;
        while(num1 < 5){
            System.out.println("The current number is " + (num1 + 1));
            num1++;
        }
//        for loop
        var i = 0;
        for (i = 0; i < 5; i++){
            System.out.println("The current number is " + (i + 1));
        }
//        do while loop
        var num2 = 0;
        do {
            System.out.println("The current number is " + (num2 + 1));
            num2++;
        } while (num2 < 5);
//        constructor call for next loop example
        loop();
        loop2();
    }
//    method called from main with indefinite while loop
    public static void loop() {
        double balance;
        int response;
        int year = 1;
        final double INT_RATE = 0.03;
        Scanner input = new Scanner(System.in);
        System.out.println("Enter initial bank balance: ");
        balance = input.nextDouble();
        System.out.println("Do you want to see next year's balance?");
        System.out.println("Press 1 for yes or any other number for no:");
        response = input.nextInt();
        while (response == 1) {
            balance = balance + balance * INT_RATE;
            System.out.println("After year " + year + " at " + (INT_RATE * 100) + "% interest rate, balance is $" + balance);
            year += 1;
            System.out.println("Do you want to see another year's balance?");
            System.out.println("Press 1 for yes or any other number for no:");
            response = input.nextInt();
        }
    }
    public static void loop2(){
        int userEntry;
        final int LIMIT = 3;
        Scanner input2 = new Scanner(System.in);
        System.out.println("Please enter an integer no higher than " + LIMIT);
        userEntry = input2.nextInt();
        while(userEntry > LIMIT){
            System.out.println("The number you entered was too high!");
            System.out.println("Please enter an integer no higher than " + LIMIT);
            userEntry = input2.nextInt();
        }
        System.out.println("You correctly entered " + userEntry);
    }

}
