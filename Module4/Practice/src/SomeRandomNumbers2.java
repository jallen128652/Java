import java.util.*;
public class SomeRandomNumbers2 {
    public static void main(String[] args){
        Random randomNumber = new Random();
        final int LIMIT = 52;
//        the LIMIT variable passes the value to the function
        System.out.println(randomNumber.nextInt(LIMIT) + 1);
        System.out.println(randomNumber.nextInt(LIMIT) + 1);
        System.out.println(randomNumber.nextInt(LIMIT) + 1);
//        this one uses a direct number as the high limit
        System.out.println(randomNumber.nextInt(25) + 1);
    }
}
