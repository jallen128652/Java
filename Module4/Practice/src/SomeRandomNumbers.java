public class SomeRandomNumbers {
    public static void main(String[] args){

        int randomNumber = 1 + (int)(Math.random() * 10);
        System.out.println(randomNumber);
        randomNumber = 1 + (int)(Math.random() * 10);
        System.out.println(randomNumber);
        randomNumber = 1 + (int)(Math.random() * 10);
        System.out.println(randomNumber);
        int ranCardValue = ((int)(Math.random() * 100) % 60 + 1);
        System.out.println(ranCardValue);
//        format for random
//        int result = ((int)(Math.random() * 100) % highrange + lowrange);
    }
}
