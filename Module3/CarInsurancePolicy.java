//example overloaded constructors
public class CarInsurancePolicy
{
//    class fields or variables
    private int policyNumber;
    private int numPayments;
    private String residentCity;

//    constructor that passes all three args
    public CarInsurancePolicy(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
//    constructor that passes the first two args
    public CarInsurancePolicy(int num, int payments)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = "Mayfield";
    }

    public CarInsurancePolicy(int num)
    {
        policyNumber = num;
        numPayments = 2;
        residentCity = "Mayfield";
    }
//    display method
    public void display()
    {
        System.out.println("Policy #" + policyNumber + ". " +
                 numPayments + " payments annually. Driver resides in " +
                 residentCity + ".");
    }

}
