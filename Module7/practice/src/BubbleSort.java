public class BubbleSort {
//    examples of bubble sorting Strings and int's
    public static void main(String[] args) {
        int[] nums = {98, 36, 44, 76, 23};
        String[] people = {"Jack", "Cindy", "George", "Kim", "Jon"};
        int temp;
        String temp1;
        int x;
        int y;
        System.out.print("The arrays before bubble sorting: " );
        for(x = 0; x < nums.length; ++x){
            System.out.print(nums[x] + " ");
        }
        System.out.print("and ");
        for(x = 0; x < people.length; ++x){
            System.out.print(people[x] + " ");
        }
        System.out.println();
        int compares = nums.length -1;
        for (x = 0; x < nums.length - 1; ++x){
            for(y = 0; y < compares; ++y){
                if(nums[y] > nums[y + 1]){
                    temp = nums[y];
                    nums[y] = nums[y + 1];
                    nums[y + 1] = temp;
                }
            }
            --compares;
        }
        int compares1 = people.length -1;
        for (x = 0; x < people.length - 1; ++x){
            for(y = 0; y < compares1; ++y){
                if(people[y].compareTo(people[y + 1]) > 0){
                    temp1 = people[y];
                    people[y] = people[y + 1];
                    people[y + 1] = temp1;
                }
            }
            --compares1;
        }
        System.out.print("The array after bubble sorting: ");
        for(x = 0; x < nums.length; ++x){
            System.out.print(nums[x] + " ");
        }
        System.out.print("and ");
        for(x = 0; x < people.length; ++x){
            System.out.print(people[x] + " ");
        }
    }
}
