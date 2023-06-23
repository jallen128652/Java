import java.util.Random;
public class SomeRandomNumbers3 {
    public static void main(String[] args){
        Random randomNumber = new Random(129867L);
//        TIMES is the amount of times the for loop will run the random
        final int TIMES = 15;
//        LIMIT is the highest num for the range
        final int LIMIT = 10;
        for(int x = 0; x < TIMES; ++x)
//            the " " just adds a space between the printed numbers. the + 1 changes the start number to 1
            System.out.print(randomNumber.nextInt(LIMIT) + 1 + " ");
        System.out.println();
    }
}
