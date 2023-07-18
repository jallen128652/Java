import java.time.*;
public class ConcatenationTimeComparison {
    public static void main(String[] args){
//        declare vars
        long startTime, endTime;
//        declare and initialize const's
        final int TIMES = 200_000;
        final int FACTOR = 1_000_000;
//        declare loop control var
        int x;
//       create new object instances of the StringBuilder class
        StringBuilder string1 = new StringBuilder("");
        StringBuilder string2 = new StringBuilder(TIMES * 4);
//        create new object instance of the LocalDateTime class
        LocalDateTime now;
        now = LocalDateTime.now();
//        initialize var with object.nonStaticClassMethod()
//        and store val in startTime var
        startTime = now.getNano();
//        run the loop 200k times
        for(x = 0; x < TIMES; ++x){
            string1.append("Java");
        }
//        store new value in now and transfer to var endTime
        now = LocalDateTime.now();
//        store now in endTime var
        endTime = now.getNano();
//        concat, calc and print
        System.out.println("Time with empty StringBuilder: " +
                ((endTime - startTime) / FACTOR + " milliseconds"));
//        repeat process for string2 object
//        not above the object string2 is initialized with TIMES * 4 String
        now = LocalDateTime.now();
        startTime = now.getNano();
        for(x = 0; x < TIMES; ++x){
            string2.append("Java");
        }
        now = LocalDateTime.now();
        endTime = now.getNano();
        System.out.println("Time with empty StringBuilder: " +
                ((endTime - startTime) / FACTOR + " milliseconds"));
    }
}
