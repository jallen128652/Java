public class Student {
    private String name; // Private variable to store the student's name
    private int totalProblemsAttempted; // Private variable to store the total number of problems attempted
    private int totalProblemsCorrect; // Private variable to store the total number of problems the student got correct

    // Function to set the student's name
    public void setName(String name) {
        this.name = name;
    }

    // Function to increment the total number of problems attempted by 1
    public void incrementTotalProblemsAttempted() {
        totalProblemsAttempted++;
    }

    // Function to increment the total number of problems the student got correct by 1
    public void incrementTotalProblemsCorrect() {
        totalProblemsCorrect++;
    }

    // Function to print the student's results
    public void printResults() {
        double score = (totalProblemsCorrect * 100.0) / totalProblemsAttempted; // Calculate the score percentage

        System.out.println("Final results for " + name + "\n");

        System.out.println("Total problems attempted: " + totalProblemsAttempted); // Print the total problems attempted
        System.out.println("Total problems correct: " + totalProblemsCorrect); // Print the total problems correct
        System.out.println("Your score is: " + score); // Print the score percentage

        // Print personalized message based on the score
        if (score >= 90) {
            System.out.println("Great job! You're doing excellent!");
        } else if (score >= 80) {
            System.out.println("Well done! Keep up the good work!");
        } else if (score >= 70) {
            System.out.println("Good job! You're improving!");
        } else {
            System.out.println("Keep practicing. You'll get better!");
        }
    }
}

