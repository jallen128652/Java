public class ArrayMethodDemo {
    public static void main (String[] args) {
        int[] numbers = {12, 15, 34, 67, 4, 9, 10, 7};
        int limit = 12;

        display(numbers);
        displayReverse(numbers);
        displaySum(numbers);
        displayLessThan(numbers, limit);
        displayHigherThanAverage(numbers);
    }
    public static void display(int[] numbers) {
        // Write your code here
        for (int x = 0; x < numbers.length; ++x) {
            System.out.print(numbers[x] + " ");
        }
    }
    public static void displayReverse(int[] numbers) {
        // Write your code here
        for(int i = 0; i < numbers.length / 2; i++)
        {
            int temp = numbers[i];
            numbers[i] = numbers[numbers.length - i - 1];
            numbers[numbers.length - i - 1] = temp;
        }
        for (int y = 0; y < numbers.length; ++y) {
            System.out.print(numbers[y] + " ");
        }
    }
    public static void displaySum(int[] numbers) {
        // Write your code here
        int sum = 0;
        for (int z = 0; z < numbers.length; ++z) {

            sum += numbers[z];
        }
        System.out.println(sum);
    }
    public static void displayLessThan(int[] numbers, int limit) {
        // Write your code here
        for (int a = 0; a < numbers.length; ++a) {
            if(numbers[a] < limit){
                System.out.print(numbers[a] + " ");
            }
        }
    }
    public static void displayHigherThanAverage(int[] numbers) {
        // Write your code here
        int average, sum = 0, count = 0;
        for(int c = 0; c < numbers.length; ++c){
            sum += numbers[c];
            count++;
        }
        average = sum / count;
        for(int c = 0; c < numbers.length; ++c){
            if(numbers[c] > average){
                System.out.print(numbers[c] + " ");
            }
        }
    }
}
