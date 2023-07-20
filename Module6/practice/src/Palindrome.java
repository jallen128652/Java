import java.util.*;
public class Palindrome {
    public static void main(String[] args) {
        // Write your code here
        // use the reverse() in stringbuilder class and deleteCharAt to remove spaces
        Scanner input = new Scanner(System.in);
//        declare StringBuilder
        StringBuilder phrase;
//        prompt user
        System.out.println("Enter a phrase to see if it's a palindrome: ");
//        store text in StringBuilder
        phrase = new StringBuilder(input.nextLine());
//        use for loop to remove spaces and punctuation
        int length = phrase.length();
        for (int x = length - 1; x >= 0; --x) {
            if (phrase.charAt(x) == ' ') {
                phrase.deleteCharAt(x);
            }
            if (phrase.charAt(x) == '.') {
                phrase.deleteCharAt(x);
            }
        }
//        convert to string and set toLower
        String str1 = phrase.toString().toLowerCase();
//        reverse and set toLower
        String str2 = String.valueOf(phrase.reverse()).toLowerCase();
//        compare strings
        if (str1.equals(str2)){
            System.out.println("You entered a palindrome");
        }else {
            System.out.println("You did not enter a palindrome");
        }
    }
}
