public class Student {
//    declare local vars
    static String name;
    private int numProblems;
    private int correctProblems;
//    pass in the name value
//    note datatype and var
    public void setName(String studName){
//        changed name of passed in var to prevent ambiguity
        name = studName;
    }
//    note for subclassFx's they have access to subclass vars
    public void setNumProblems(){
//        increment the counts
        numProblems++;
    }
    public void setCorrectProblems(){
//        increment the counts
        correctProblems++;
    }
//    moved the final print to a fx here. If I understand correctly,
//    I could also move this to the main class with getter fx's to call
//    for the values?
    public void display(){
        System.out.println("Final results for " + name);
        double percent;
//        do percentage math, note cast ints to doubles, precision gained not lost
        percent = (double) correctProblems / numProblems * 100;
//        output results
        System.out.println("Total problems attempted: " + numProblems);
        System.out.println("Total problems correct: " + correctProblems);
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
}
