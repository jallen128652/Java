import java.util.Random;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Random random = new Random();

        Student student = new Student(); // Create a Student object to store the student's information

        System.out.print("Enter student's name: ");
        String name = scanner.nextLine();
        student.setName(name); // Set the student's name using the Student object

        int menuOption;

        // Loop the main menu until the student chooses Exit
        do {
            // Print the main menu
            System.out.println("\nMath Tutor Menu\n");
            System.out.println("1. Addition");
            System.out.println("2. Subtraction");
            System.out.println("3. Multiplication");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            menuOption = scanner.nextInt();
//                                  student, random and scanner are objects created above and passed into the fx calls
            switch (menuOption) {
                case 1:
                    performAddition(student, random, scanner); // Call the function to perform addition problems
                    break;
                case 2:
                    performSubtraction(student, random, scanner); // Call the function to perform subtraction problems
                    break;
                case 3:
                    performMultiplication(student, random, scanner); // Call the function to perform multiplication problems
                    break;
                case 4:
                    student.printResults(); // Print the final results using the Student object
                    System.out.println("Thank you for using the Math Tutor. Goodbye!");
                    break;
                default:
                    System.out.println("Invalid menu option. Please try again.");
            }
        } while (menuOption != 4);

        scanner.close();
    }

    // Function to perform addition problems
//                note the fx accepts the Class name and class object for student, random, scanner
    public static void performAddition(Student student, Random random, Scanner scanner) {
        int num1, num2;
        int correctAnswer, userAnswer;

        do {
            num1 = random.nextInt(10) + 1; // Generate a random number between 1 and 10
            num2 = random.nextInt(10) + 1; // Generate another random number between 1 and 10
            correctAnswer = num1 + num2; // Calculate the correct answer

            System.out.print("\n" + num1 + " + " + num2 + " = "); // Print the addition problem
            userAnswer = scanner.nextInt(); // Get the student's answer from the user

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                student.incrementTotalProblemsCorrect(); // Increment the total problems correct using the Student object
            } else {
                System.out.println("Incorrect!");
            }

            student.incrementTotalProblemsAttempted(); // Increment the total problems attempted using the Student object
//            updates the loop control variable
            System.out.print("Do you want to try another problem? (Y/N): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        } while (true);
    }

    // Function to perform subtraction problems
    public static void performSubtraction(Student student, Random random, Scanner scanner) {
        int num1, num2;
        int correctAnswer, userAnswer;

        do {
            num1 = random.nextInt(10) + 1; // Generate a random number between 1 and 10
            num2 = random.nextInt(10) + 1; // Generate another random number between 1 and 10

            // Ensure num1 is greater than or equal to num2
            if (num1 < num2) {
                int temp = num1;
                num1 = num2;
                num2 = temp;
            }

            correctAnswer = num1 - num2; // Calculate the correct answer

            System.out.print("\n" + num1 + " - " + num2 + " = "); // Print the subtraction problem
            userAnswer = scanner.nextInt(); // Get the student's answer from the user

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                student.incrementTotalProblemsCorrect(); // Increment the total problems correct using the Student object
            } else {
                System.out.println("Incorrect!");
            }

            student.incrementTotalProblemsAttempted(); // Increment the total problems attempted using the Student object

            System.out.print("Do you want to try another problem? (Y/N): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        } while (true);
    }

    // Function to perform multiplication problems
    public static void performMultiplication(Student student, Random random, Scanner scanner) {
        int num1, num2;
        int correctAnswer, userAnswer;

        do {
            num1 = random.nextInt(10) + 1; // Generate a random number between 1 and 10
            num2 = random.nextInt(10) + 1; // Generate another random number between 1 and 10
            correctAnswer = num1 * num2; // Calculate the correct answer

            System.out.print("\n" + num1 + " * " + num2 + " = "); // Print the multiplication problem
            userAnswer = scanner.nextInt(); // Get the student's answer from the user

            if (userAnswer == correctAnswer) {
                System.out.println("Correct!");
                student.incrementTotalProblemsCorrect(); // Increment the total problems correct using the Student object
            } else {
                System.out.println("Incorrect!");
            }

            student.incrementTotalProblemsAttempted(); // Increment the total problems attempted using the Student object

            System.out.print("Do you want to try another problem? (Y/N): ");
            String choice = scanner.next();

            if (!choice.equalsIgnoreCase("Y")) {
                break;
            }
        } while (true);
    }
}
