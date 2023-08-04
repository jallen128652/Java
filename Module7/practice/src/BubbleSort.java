import java.util.*;
public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {98, 36, 44, 76, 23};

        int temp;
        int x;
        int y;
        System.out.print("The array before bubble sorting: " );
        for(x = 0; x < nums.length; ++x){
            System.out.print(nums[x] + " ");
        }
        System.out.println();
        int compares = nums.length -1;
        for (x = 0; x < nums.length - 1; ++x){
            for(y = 0; y < nums.length - 1; ++y){
                if(nums[y] > nums[y + 1]){
                    temp = nums[y];
                    nums[y] = nums[y + 1];
                    nums[y + 1] = temp;
                }
            }
            --compares;
        }
        System.out.print("The array after bubble sorting: ");
        for(x = 0; x < nums.length; ++x){
            System.out.print(nums[x] + " ");
        }
    }
}
