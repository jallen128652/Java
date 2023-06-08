// this is a non-static class with instance methods; not a standalone program, no main method
// will use to create objects

public class SpaService {
//    private data fields or private variables
    private String serviceDescription;
    private double price;
//    explicit default constructor
    public SpaService()
    {
        serviceDescription = "XXX";
        price = 0;
    }

//    instance method declarations
    public void setServiceDescription(String service)
    {
        serviceDescription = service;
    }
    public void setPrice(double servicePrice)
    {
        price = servicePrice;
    }
    public String getServiceDescription()
    {
        return serviceDescription;
    }
    public double getPrice()
    {
        return price;
    }
}
