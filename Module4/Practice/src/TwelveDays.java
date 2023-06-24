import java.util.*;
public class TwelveDays {
    public static void main (String[] args) {
        // Write your code here
//        declares the variable and calls the method to initialize the variable
        int days = getChoice();


        if(days == 1) {
            System.out.println("On the " + days + "st day of Christmas\nMy true love gave to me");
        } else if (days == 2) {
            System.out.println("On the " + days + "nd day of Christmas\nMy true love gave to me");
        } else if (days == 3) {
            System.out.println("On the " + days + "rd day of Christmas\nMy true love gave to me");
        } else {
            System.out.println("On the " + days + "th day of Christmas\nMy true love gave to me");
        }

        switch(days) {
            case 12:
                System.out.println("Twelve drummers drumming");
            case 11:
                System.out.println("Eleven pipers piping");
            case 10:
                System.out.println("Ten lords a-leaping");
            case 9:
                System.out.println("Nine ladies dancing");
            case 8:
                System.out.println("Eight maids a-milking");
            case 7:
                System.out.println("Seven swans a-swimming");
            case 6:
                System.out.println("Six geese a-laying");
            case 5:
                System.out.println("Five golden rings");
            case 4:
                System.out.println("Four calling birds");
            case 3:
                System.out.println("Three French hens");
            case 2:
                System.out.println("Two turtle doves and");
            case 1:
                System.out.println("A partridge in a pear tree");
                break;
        }
    }
    public static int getChoice() {
        // Write your code here
        Scanner input = new Scanner(System.in);
        System.out.println("From what day do you want to start the song The Twelve Days of Christmas?");
        int days;
        days = input.nextInt();
        return days;
    }

}
