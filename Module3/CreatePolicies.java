// class that calls the overloaded constructor class.
public class CreatePolicies
{
    public static void main(String[] args)
    {
//        car insurance policy objects calling the overloaded constructors
        CarInsurancePolicy first = new CarInsurancePolicy(123);
        CarInsurancePolicy second = new CarInsurancePolicy(456, 4);
        CarInsurancePolicy third = new CarInsurancePolicy(789, 12, "Newcastle");
//        CarInsurancePolicy fourth = new CarInsurancePolicy();
//        calling the display methods
        first.display();
        second.display();
        third.display();
    }
}
