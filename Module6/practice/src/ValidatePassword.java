import java.util.*;
public class ValidatePassword {
    public static void main(String[] args) {
        // Write your code here
        String pw;
        boolean valid = false;
        Scanner input = new Scanner(System.in);
        while (!valid) {
            System.out.println("Please enter a password that contains at least two uppercase letters, at least three lowercase letters, and at least one digit:");
            pw = input.nextLine();
            char[] pwChar = pw.toCharArray();
            int length = pw.length();
            int digitCount = 0;
            int upperCount = 0;
            int lowerCount = 0;
            for (int x = 0; x < length; x++) {
//                note Class.staticMethod(arrayArg[])
                if (Character.isDigit(pwChar[x])) {
                    digitCount++;
                }
                if (Character.isLowerCase(pwChar[x])) {
                    lowerCount++;
                }
                if (Character.isUpperCase(pwChar[x])) {
                    upperCount++;
                }
            }
            if (upperCount < 2 && lowerCount < 3 && digitCount < 1) {
                System.out.println("The password did not have enough of the following:");
                System.out.println("uppercase letters");
                System.out.println("lowercase letters");
                System.out.println("digits");
            } else if (upperCount < 2 && lowerCount < 3) {
                System.out.println("The password did not have enough of the following:");
                System.out.println("uppercase letters");
                System.out.println("lowercase letters");
            } else if (upperCount < 1 && digitCount < 1) {
                System.out.println("The password did not have enough of the following:");
                System.out.println("uppercase letters");
                System.out.println("digits");
            } else if (upperCount < 2) {
                System.out.println("The password did not have enough of the following:");
                System.out.println("uppercase letters");
            } else if (lowerCount < 3 && digitCount < 1) {
                System.out.println("The password did not have enough of the following:");
                System.out.println("lowercase letters");
                System.out.println("digits");
            } else if (lowerCount < 3) {
                System.out.println("lowercase letters");
            } else if (digitCount < 1) {
                System.out.println("digits");
            } else {
                System.out.println("Valid Password");
                valid = true;
            }
        }
    }
}

// needs to have the following prints:
//The password did not have enough of the following:
//uppercase letters
//lowercase letters
//digits
//needs to loop if the password is not valid