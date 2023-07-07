public class Student {
    String name;
    static int numProblems;

    public static void setNumProblems(int numProblems){
        Student.numProblems = numProblems;
    }
    public static int getNumProblems(int numProblems){
        return Student.numProblems;
    }
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

}
