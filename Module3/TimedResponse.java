//import packages
import javax.swing.JOptionPane;
// note the wildcard import of all time classes in the package
import java.time.*;

public class TimedResponse
{
    public static void main(String[] args)
    {
//      call class    local objs time1 and time 2
        LocalDateTime time1, time2;
//      local variables
        int seconds1, seconds2, difference;

//        assign current time obj and get the data from the .now fx, now transfer to seconds
        time1 = LocalDateTime.now();
        seconds1 = time1.getSecond();
//        add an input dialog box
        JOptionPane.showConfirmDialog(null, "Is stealing ever justified?");
//        record the time it took to answer
        time2 = LocalDateTime.now();
        seconds2 = time2.getSecond();
//        output the times
        difference = seconds2 - seconds1;
        JOptionPane.showMessageDialog(null, "End seconds: " + seconds2 +
                 "\nStart seconds: " + seconds1 +
                 "\nIt took " + difference + " seconds for you to answer");

    }
}
