//class that calls the overloaded constructor class using this
public class CreatePolicies2
{

    public static void main(String[] args)
    {
//        car insurance policy objects calling the overloaded constructors
        CarInsurancePolicy2 first = new CarInsurancePolicy2(123);
        CarInsurancePolicy2 second = new CarInsurancePolicy2(456, 4);
        CarInsurancePolicy2 third = new CarInsurancePolicy2(789, 12, "Newcastle");
//        CarInsurancePolicy fourth = new CarInsurancePolicy();
//        calling the display methods
        first.display();
        second.display();
        third.display();
    }
}
