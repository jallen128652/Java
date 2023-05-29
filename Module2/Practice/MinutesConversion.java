import java.util.Scanner;

public class MinutesConversion {

    public static void main(String[] args) {
        // variables
        double minutes;
        double hours;
        double days;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter number of minutes: ");
        minutes = input.nextDouble();

        hours = minutes / 60;
        days = minutes / 1440;
        // static casting the decimal place on the minutes variable
        System.out.println(String.format("%.0f", minutes) + " minutes is " + hours +
                " hours or " + days + " days.");
    }
}
