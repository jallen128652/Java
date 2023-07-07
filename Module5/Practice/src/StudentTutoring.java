import java.util.Scanner;
public class StudentTutoring {
    public static void main(String[] args) {
//       declarations
        int selection, correctCounter, numCounter;
//        create instance
        Student practice = new Student();
//        input, set name
        Scanner input = new Scanner(System.in);
        System.out.println("Please enter your name: ");
        Student.name = input.nextLine();
        practice.setName(Student.name);


//        select type of math practice menu
        System.out.println("Math Tutor Menu\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Exit");
        System.out.println("Please enter a selection: ");
        selection = input.nextInt();
//        clear input stream, don't know if this is correct, had issues without it though put them
//        after most inputs till the issues gone(feedback please)
        input.nextLine();


// menu decision while loop with if/else if structure
        while (selection != 4) {
            if (selection == 1) {
                addition();
            } else if (selection == 2) {
                subtraction();
            } else if (selection == 3) {
                multiplication();
            }
//            update loop control variable
            System.out.println("Math Tutor Menu\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Exit");
            System.out.println("Please enter a selection: ");
            selection = input.nextInt();
            input.nextLine();
        }
//          print final results
        System.out.println("You chose exit.");
//        call getter
        String studentName = Student.getName();
        System.out.println("Final results for " + studentName);
        double percent;
//        call getters
        numCounter = practice.getNumProblems();
        correctCounter = practice.getCorrectProblems();
//        do percentage math
        percent = (double) correctCounter / numCounter * 100;
//        output results
        System.out.println("Total problems attempted: " + numCounter);
        System.out.println("Total problems correct: " + correctCounter);
        System.out.println("Your score is " + String.format("%.0f", percent));
//        control structure for final feedback to user
        if (percent >= 90 && percent <= 100) {
            System.out.println("Your doing great, keep it up!");
        } else if (percent >= 80 && percent <= 89) {
            System.out.println("Your doing good, keep it practicing!");
        } else if (percent >= 70 && percent <= 79) {
            System.out.println("Your doing ok, need more practice!");
        } else if (percent > 1 && percent <= 69) {
            System.out.println("Keep practicing!");
        }
    }

    //    methods for the actual practice
    static void addition() {
        Scanner input = new Scanner(System.in);
        System.out.println("You chose Addition.");
//        declare locals
        int tries, rand1, rand2, answer, correctAnswer;
//        input selection to do a math problem and initialize the while loop control variable
        System.out.println("Press 1 to try an Addition problem and any other number to stop.");
        tries = input.nextInt();
        while (tries == 1) {
            //        generate to rand nums
            rand1 = 1 + (int) (Math.random() * 10);
            rand2 = 1 + (int) (Math.random() * 10);
            correctAnswer = rand1 + rand2;
//            display them as an addition problem
            System.out.println(rand1 + " + " + rand2 + " = ?");
//            get user answer
            answer = input.nextInt();
            input.nextLine();
//            compare user answer with correct answer
            if (answer == correctAnswer) {
                //            display right answer and output if user is correct
                System.out.println("Correct! " + rand1 + " + " + rand2 + " = " + answer);
//                call setters to increment the counts
                Student.setNumProblems();
                Student.setCorrectProblems();
            } else {
                System.out.println("Incorrect! " + rand1 + " + " + rand2 + " = " + correctAnswer);
                Student.setNumProblems();
            }
//            update loop control variable
            System.out.println("Press 1 to try an Addition problem and any other number to stop.");
            tries = input.nextInt();
        }
    }

    static void subtraction() {
        Scanner input = new Scanner(System.in);
        System.out.println("You chose Subtraction.");
//        declare locals
        int tries, rand1, rand2, answer, correctAnswer;
//        input selection to do a math problem and initialize the while loop control variable
        System.out.println("Press 1 to try an Subtraction problem and any other number to stop.");
        tries = input.nextInt();
        while (tries == 1) {
            //        generate to rand nums
            rand1 = 1 + (int) (Math.random() * 10);
            rand2 = 1 + (int) (Math.random() * 10);
            correctAnswer = rand1 - rand2;
//            display them as an addition problem
            System.out.println(rand1 + " - " + rand2 + " = ?");
//            get user answer
            answer = input.nextInt();
            input.nextLine();
//            compare user answer with correct answer
            if (answer == correctAnswer) {
                //            display right answer and output if user is correct
                System.out.println("Correct! " + rand1 + " - " + rand2 + " = " + answer);
//                call setters to increment the counts
                Student.setNumProblems();
                Student.setCorrectProblems();
            } else {
                System.out.println("Incorrect! " + rand1 + " + " + rand2 + " = " + correctAnswer);
                Student.setNumProblems();
            }
//            update loop control variable
            System.out.println("Press 1 to try an Subtraction problem and any other number to stop.");
            tries = input.nextInt();
        }
    }

    static void multiplication() {
        Scanner input = new Scanner(System.in);
        System.out.println("You chose Multiplication.");
//        declare locals
        int tries, rand1, rand2, answer, correctAnswer;
        System.out.println("Press 1 to try an Multiplication problem and any other number to stop.");
        tries = input.nextInt();
        while (tries == 1) {
            //        generate to rand nums
            rand1 = 1 + (int) (Math.random() * 10);
            rand2 = 1 + (int) (Math.random() * 10);
            correctAnswer = rand1 * rand2;
//            display them as an addition problem
            System.out.println(rand1 + " x " + rand2 + " = ?");
//            get user answer
            answer = input.nextInt();
            input.nextLine();
//            compare user answer with correct answer
            if (answer == correctAnswer) {
                //            display right answer and output if user is correct
                System.out.println("Correct! " + rand1 + " x " + rand2 + " = " + answer);
//                call setters to increment the counts
                Student.setNumProblems();
                Student.setCorrectProblems();
            } else {
                System.out.println("Incorrect! " + rand1 + " + " + rand2 + " = " + correctAnswer);
                Student.setNumProblems();
            }
//            update loop control variable
            System.out.println("Press 1 to try an Multiplication problem and any other number to stop.");
            tries = input.nextInt();
        }
    }
}
