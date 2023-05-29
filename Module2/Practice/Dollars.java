//input library utility
import java.util.Scanner;
class Dollars {
    public static void main(String[] args) {
        // variables
        int num;
        int twenties;
        int tens;
        int fives;
        int ones;
//      input method
        Scanner input = new Scanner(System.in);
//      input
        System.out.print("Please enter dollar amount: ");
        num = input.nextInt();
//      logic
        twenties = num / 20;
        tens = (num % 20) / 10;
        fives = ((num % 20) % 10) / 5;
        ones = (((num % 20) % 10) % 5);
//      output
        System.out.println("$" + num + " converted is " + twenties + " $20s, " +
                tens + " $10s, " + fives + " $5s, and " + ones + " $1s");

    }
}
