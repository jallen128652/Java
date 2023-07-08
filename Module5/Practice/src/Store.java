public class Store {
//    declare private variables
    private String name;
    private double subtotal;
    private double tax;
    private double total;
//    declare private final constants
    private final double PRICE = 6.99;
    private final double TAX_RATE = 0.0825;
//    create setters and getters for name, subtotal, tax, total
    public void setName(String name){
        this.name = name;
    }
    public String getName(){
        return name;
    }

    public void setSubtotal(double subtotal){
        this.subtotal = subtotal;
    }
    public double getSubtotal(){
        return subtotal;
    }

    public void setTax(double tax){
        this.tax = tax;
    }
    public double getTax(){
        return tax;
    }

    public void setTotal(double total){
        this.total = total;
    }
    public double getTotal(){
        return total;
    }
//    create method to calculate what customer owes
    public void calcOwes(int numItems){
        subtotal = numItems * PRICE;
        tax = subtotal * TAX_RATE;
        total = subtotal + tax;
    }
}
