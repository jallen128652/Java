import java.util.*;
class MorgansBonuses
{
    public static void main(String[] args)
    {
        // your code here
        double[][] weeks = {{5.00, 9.00, 16.00, 22.00, 30.00},
                {10.00, 12.00, 18.00, 24.00, 36.00},
                {20.00, 25.00, 32.00, 42.00, 53.00},
                {32.00, 38.00, 45.00, 55.00, 68.00},
                {46.00, 54.00, 65.00, 77.00, 90.00},
                {60.00, 72.00, 84.00, 96.00, 120.00},
                {85.00, 100.00, 120.00, 140.00, 175.00}};
        int row, column;
        final int QUIT = 99;
        Scanner input = new Scanner(System.in);
        System.out.print("Enter number of full weeks worked or " + QUIT + " to quit >> ");
        row = input.nextInt();
        while (row != QUIT) {
            System.out.print("Enter number of positive reviews received >> ");
            column = input.nextInt();

            if(row >= 0 && row <= 6 && column >= 0 && column <= 4) {
                System.out.println("Bonus for " + row + " weeks and " + column +
                        " positive reviews is " + weeks[row][column]);
            } else if(row > 6 && column >= 0 && column <= 4){
                System.out.println("Bonus for " + row + " weeks and " + column +
                        " positive reviews is " + weeks[6][column]);
            } else if(row >= 0 && row <= 6 && column > 4){
                System.out.println("Bonus for " + row + " weeks and " + column +
                        " positive reviews is " + weeks[row][4]);
            } else {
                System.out.println("Bonus for " + row + " weeks and " + column +
                        " positive reviews is " + weeks[6][4]);
            }
            System.out.print("Enter number of full weeks worked or " + QUIT + " to quit >> ");
            row = input.nextInt();
        }
    }
}
/*Morgan’s Department Store distributes bonuses to its salespeople after the holiday
 rush. Table 9-6 shows the bonuses, which are based on full weeks worked during the
  season and the number of positive online customer reviews. Write a program that
   allows a user to continuously enter values for the number of weeks worked and
    the number of positive reviews received and displays the appropriate bonus until
     the user enter a sentinel value: 99.

     Example output:
     Enter number of full weeks worked or 99 to quit >> 2
     Enter number of positive reviews received >> 3
     Bonus for 2 weeks and 3 positive reviews is 42.0
     Enter number of full weeks worked or 99 to quit >> 99
     */
