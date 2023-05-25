public class IntegerDemo {
    public static void main(String[] args)
    {
        int anInt = 1234;
        byte aByte = 12;
        short aShort = 12345;
        long aLong = 1234567890987654321L;
//        the total would be to long giving a bad output even though no syntax error.
//        use a different data type when the output is clearly wrong.
        int anotherInt = anInt * 10000000;

        System.out.println("The int is " + anInt);
        System.out.println("The byte is " + aByte);
        System.out.println("The short is " + aShort);
        System.out.println("The long is " + aLong);
        System.out.println("Another int is " + anotherInt);
    }
}
