public class Student {
    static String name;
//    the private vars gave me a ton of grief, still don't know why to use static,
//    but the ide said so or else lol
    private static int numProblems;
    private static int correctProblems;
//    pass in the name value
    public void setName(String name){
        Student.name = name;
    }
    public static String getName(){
        return name;
    }
    public static void setNumProblems(){
//        increment the counts
        numProblems++;
    }
    public int getNumProblems(){
        return numProblems;
    }
    public static void setCorrectProblems(){
//        increment the counts
        correctProblems++;
    }
    public int getCorrectProblems(){
        return correctProblems;
    }

}
