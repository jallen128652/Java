public class DemoArray3 {
    public static void main(String[] args) {
        double[] salaries = {12.25, 13.55, 14.25, 16.85};

        System.out.println("Salaries one by one are:");
//        standard for loop
        for (int x = 0; x < salaries.length; ++x) {
            System.out.println(salaries[x]);
        }
//        enhanced for loop ***note the data type matches the data type of the stored
//        array values
        for (double val : salaries) {
            System.out.println(val);
        }
    }
}
