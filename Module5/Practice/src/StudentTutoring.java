import java.util.Scanner;
public class StudentTutoring {
    public static void main(String[] args) {
//       mainfx local declarations
        int selection;
//        create instances of objects for subclasses and imported classes
//        subclass object
        Student practice = new Student();
//        imported class object
        Scanner input = new Scanner(System.in);
//      prompt user for name
        System.out.println("Please enter your name: ");
//        declare and initialize var into the input stream
        String name = input.nextLine();
//        object.subclassFx(var)
        practice.setName(name);
//        select type of math practice menu
        System.out.println("Math Tutor Menu\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Exit");
        System.out.println("Please enter a selection: ");
        selection = input.nextInt();
//        clear input stream
        input.nextLine();
// menu decision while loop with if/else if structure
        while (selection != 4) {
            if (selection == 1) {
                addition(practice, input);
            } else if (selection == 2) {
                subtraction(practice, input);
            } else if (selection == 3) {
                multiplication(practice, input);
            }
//            update loop control variable
            System.out.println("Math Tutor Menu\n 1. Addition\n 2. Subtraction\n 3. Multiplication\n 4. Exit");
            System.out.println("Please enter a selection: ");
            selection = input.nextInt();
            input.nextLine();
        }
//          print final results
        System.out.println("You chose exit.");
//        call subclass displayFx
//        note object.subclassFx()
        practice.display();
    }
    //    methods for the actual practice
//    note the Class and object being passed in ex. Student practice, Scanner input
    static void addition(Student practice, Scanner input) {
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
//                call fx to increment the counts
//                note object.subclassFx()
                practice.setNumProblems();
                practice.setCorrectProblems();
            } else {
                System.out.println("Incorrect! " + rand1 + " + " + rand2 + " = " + correctAnswer);
                practice.setNumProblems();
            }
//            update loop control variable
            System.out.println("Press 1 to try an Addition problem and any other number to stop.");
            tries = input.nextInt();
        }
    }
    static void subtraction(Student practice, Scanner input) {
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
//            changes to ensure the user doesn't have to enter a negative number
//            decision structure to choose greater rand value
            if (rand1 >= rand2) {
                correctAnswer = rand1 - rand2;
                System.out.println(rand1 + " - " + rand2 + " = ?");
                //            get user answer
                answer = input.nextInt();
                input.nextLine();
//            compare user answer with correct answer
                if (answer == correctAnswer) {
                    //            display right answer and output if user is correct
                    System.out.println("Correct! " + rand1 + " - " + rand2 + " = " + answer);
//                call object.subclassFx() to increment the counts
                    practice.setNumProblems();
                    practice.setCorrectProblems();
                } else {
                    System.out.println("Incorrect! " + rand1 + " + " + rand2 + " = " + correctAnswer);
                    practice.setNumProblems();
                }
//                if rand2 is the greater value
            } else {
                correctAnswer = rand2 - rand1;
                System.out.println(rand2 + " - " + rand1 + " = ?");
                //            get user answer
                answer = input.nextInt();
                input.nextLine();
//            compare user answer with correct answer
                if (answer == correctAnswer) {
                    //            display right answer and output if user is correct
                    System.out.println("Correct! " + rand2 + " - " + rand1 + " = " + answer);
//                call object.subclassFx() to increment the counts
                    practice.setNumProblems();
                    practice.setCorrectProblems();
                } else {
                    System.out.println("Incorrect! " + rand2 + " - " + rand1 + " = " + correctAnswer);
                    practice.setNumProblems();
                }
            }
//            update loop control variable
            System.out.println("Press 1 to try an Subtraction problem and any other number to stop.");
            tries = input.nextInt();
        }
    }
    static void multiplication(Student practice, Scanner input) {
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
//                 call object.subclassFx() to increment the counts
                practice.setNumProblems();
                practice.setCorrectProblems();
            } else {
                System.out.println("Incorrect! " + rand1 + " + " + rand2 + " = " + correctAnswer);
                practice.setNumProblems();
            }
//            update loop control variable
            System.out.println("Press 1 to try an Multiplication problem and any other number to stop.");
            tries = input.nextInt();
        }
    }
}
