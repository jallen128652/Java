import java.util.Scanner;
import java.util.ArrayList;
public class Majors {

    enum Major {ACC, CHEM, CIS, ENG, HIS, PHYS};

    public static void main(String[] args) {
        // Write your code here
        Major major;
        Scanner input = new Scanner(System.in);
        for(Major maj : Major.values()){
            System.out.print(maj + " ");
        }
        System.out.println("Enter a major from the list: ");
        major = Major.valueOf(input.nextLine().toUpperCase());
        switch(major){
            case ACC:
                System.out.println("Business");
                break;
            case CIS:
                System.out.println("Business");
                break;
            case CHEM:
                System.out.println("Science");
                break;
            case PHYS:
                System.out.println("Science");
                break;
            case ENG:
                System.out.println("Humanities");
                break;
            case HIS:
                System.out.println("Humanities");
                break;
            default:
                System.out.println("Invalid input");
        }
    }
}
