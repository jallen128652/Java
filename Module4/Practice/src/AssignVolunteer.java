import java.util.Scanner;
public class AssignVolunteer {
    public static void main(String[] args){
        int donationType;
        String volunteer;
        final int CLOTHING_CODE = 1;
        final int OTHER_CODE = 2;
        final String CLOTHING_PRICER = "Regina";
        final String OTHER_PRICER = "Marco";
        String message;

        Scanner input = new Scanner(System.in);
        System.out.println("What type of donation is this?");
        System.out.print("Enter " + CLOTHING_CODE + " for clothing, " + OTHER_CODE + " for anything else: ");
        donationType = input.nextInt();
// nested if and else
        if (donationType == CLOTHING_CODE || donationType == OTHER_CODE) {
            if (donationType == CLOTHING_CODE) {
                volunteer = CLOTHING_PRICER;
                message = "a clothing donation.";
            } else {
                volunteer = OTHER_PRICER;
                message = "a non-clothing item.";
            }
        } else {
                volunteer = "invalid";
                message = "an invalid input.";
        }


        System.out.println("You entered " + donationType);
        System.out.println("The volunteer who will price this item is " + volunteer);
        System.out.println("This is " + message);
    }
}
