public class Student {
    static String name;
    private static int numProblems;
    private static int correctProblems;
    public void setName(String name){
        Student.name = name;
    }
    public static String getName(){
        return name;
    }
    public static void setNumProblems(){
        numProblems++;
    }
    public int getNumProblems(){
        return numProblems;
    }
    public static void setCorrectProblems(){
        correctProblems++;
    }
    public int getCorrectProblems(){
        return correctProblems;
    }

}
