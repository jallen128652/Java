import java.util.*;
public class PigLatin {
    public static void main(String[] args) {
        // Write your code here
        Scanner input = new Scanner(System.in);
        StringBuilder word = new StringBuilder();
        System.out.println("Enter a word");
        word = new StringBuilder(input.nextLine());
        char c = word.charAt(0);
        boolean isVwl = isVowel(c);
        if (isVowel(c)){
            word.append("ay");
        }else {
            word.deleteCharAt(0).append(c).append("ay");
        }
        System.out.println(word);

    }
    public static boolean isVowel(char c) {
        // Write your code here
        String VOWELS = "aeiouAEIOU";
//        checks for a match from char c and any letter in the VOWELS string
        if (VOWELS.indexOf(c) != -1){
            return true;
        } else {
            return false;
        }
    }
}

/**/
