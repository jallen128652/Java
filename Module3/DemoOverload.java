
// overloading methods example program
public class DemoOverload
{
    public static void main(String[] args)
    {
//        3 different integers in order
        int month = 6, day = 24, year = 2019;
//        three method calls with different variables passed in
        displayDate(month);
        displayDate(month, day);
        displayDate(month, day, year);
    }
    public static void displayDate(int mm)
    {
        System.out.println("Event date " + mm + "/1/2018");
    }
    public static void displayDate(int mm, int dd)
    {
        System.out.println("Event date " + mm + "/" + dd + "/2018");
    }
    public static void displayDate(int mm, int dd, int yy)
    {
        System.out.println("Event date " + mm + "/" + dd + "/" + yy);
    }
}
