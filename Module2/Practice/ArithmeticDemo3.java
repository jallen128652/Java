import java.util.Scanner;

public class ArithmeticDemo3
{
    public static void main(String[] args)
    {
        int firstNumber;
        int secondNumber;
        int sum;
        int difference;
        double average;

        Scanner input = new Scanner(System.in);

        System.out.print("Please enter an integer: ");
        firstNumber = input.nextInt();
        System.out.print("Please enter another integer: ");
        secondNumber = input.nextInt();

        sum = firstNumber + secondNumber;
        difference = firstNumber - secondNumber;
//        average's expression is explicitly cast as a double so the output is a accurate.
//        if we just label the variable type as a double it will still truncate the decimals
//        during the calculation of the expression
          average = (double) sum / 2; //we could implicitly case this by using 2.0

        System.out.println(firstNumber + " + " +
                secondNumber + " is " + sum);
        System.out.println(firstNumber + " - " +
                secondNumber + " is " + difference);
        System.out.println("The average of " + firstNumber +
                " and " + secondNumber + " is " + average);

    }
}
