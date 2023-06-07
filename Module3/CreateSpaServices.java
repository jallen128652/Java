// static class that accesses non static class and private data
import java.util.Scanner;
public class CreateSpaServices {
    public static void main(String[] args) {
//        declare variables
        String service;
        double price;
//        declare objects
        SpaService firstService = new SpaService();
        SpaService secondService = new SpaService();
        Scanner keyboard = new Scanner(System.in);
//        get input from the user
        System.out.print("Enter service: ");
        service = keyboard.nextLine();
        System.out.print("Enter price: ");
        price = keyboard.nextDouble();
//        call set method in spaService non-static class
        firstService.setServiceDescription(service);
        firstService.setPrice(price);
//        clear input buffer
        keyboard.nextLine();
//        get inputs for secondService
        System.out.print("Enter service: ");
        service = keyboard.nextLine();
        System.out.print("Enter price: ");
        price = keyboard.nextDouble();
//        call set method in spaService non-static class
        secondService.setServiceDescription(service);
        secondService.setPrice(price);
//        print details for first and second service objects
        System.out.println("First service details: ");
            System.out.println(firstService.getServiceDescription() + " $" + firstService.getPrice());
        System.out.println("Second service details: ");
            System.out.println(secondService.getServiceDescription() + " $" + secondService.getPrice());

    }
}
