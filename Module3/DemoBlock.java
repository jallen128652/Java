

public class DemoBlock
{
    public static void main(String[] args)
    {
//        main block
      System.out.println("Demonstrating block scope");
      int x = 1111;
      System.out.println("In the first block x is: " + x);
//      sub block
        {
            int y = 2222;
            System.out.println("The second block x is: " + x);
            System.out.println("The second block y is: " + y);

        }
//        sub block 2
        {
            int y = 3333;
            System.out.println("In the third block x is: " + x);
            System.out.println("In the third block y is: " + y);
            demoMethod(); //call to method
            System.out.println("After method x is: " + x);
            System.out.println("After method block y is: " + y);
        }
//        back in main
        System.out.println("At the end x is: " + x);
    }
//    parallel to main method
    public static void demoMethod()
    {
        int x = 8888, y = 9999;
        System.out.println("In demoMethod x is: " + x);
        System.out.println("In demoMethod block y is: " + y);

    }
}
