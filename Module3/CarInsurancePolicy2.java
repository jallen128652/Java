//example overloaded constructors using explicit this

public class CarInsurancePolicy2
{
    //    class fields or variables
    private int policyNumber;
    private int numPayments;
    private String residentCity;

    //    constructor that passes all three args
    public CarInsurancePolicy2(int num, int payments, String city)
    {
        policyNumber = num;
        numPayments = payments;
        residentCity = city;
    }
    //    constructor that passes the first two args
    public CarInsurancePolicy2(int num, int payments)
    {
        this(num, payments, "Mayfield");
    }

    public CarInsurancePolicy2(int num)
    {
        this(num, 2, "Mayfield");
    }
    //    display method
    public void display()
    {
        System.out.println("Policy #" + policyNumber + ". " +
                numPayments + " payments annually. Driver resides in " +
                residentCity + ".");
    }

}
