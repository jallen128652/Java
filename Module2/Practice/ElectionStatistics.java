import java.util.Scanner;
class ElectionStatistics {
    public static void main(String[] args) {
        String party1, party2, party3;
        double votes1, votes2, votes3, total, percent1, percent2, percent3;

        Scanner inputDevice = new Scanner(System.in);

        System.out.print("Enter name for first party >> ");
        party1 = inputDevice.nextLine();
        System.out.print("Enter votes received >> ");
        votes1 = inputDevice.nextDouble();
        inputDevice.nextLine();
        System.out.print("Enter name for second party >> ");
        party2 = inputDevice.nextLine();
        System.out.print("Enter votes received >> ");
        votes2 = inputDevice.nextDouble();
        inputDevice.nextLine();
        System.out.print("Enter name for third party >> ");
        party3 = inputDevice.nextLine();
        System.out.print("Enter votes received >> ");
        votes3 = inputDevice.nextDouble();
        inputDevice.nextLine();

        total = (votes1 + votes2 + votes3);
        percent1 = (votes1 / total) * 100;
        percent2 = (votes2 / total) * 100;
        percent3 = (votes3 / total) * 100;

        System.out.println("The " + party1 + " party got " + percent1 +
                " percent of the vote");
        System.out.println("The " + party2 + " party got " + percent2 +
                " percent of the vote");
        System.out.println("The " + party3 + " party got " + percent3 +
                " percent of the vote");
    }
}
