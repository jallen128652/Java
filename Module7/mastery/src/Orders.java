public class Orders {
// required 4 vars
    private int qty1;
    private int qty2;
    private int qty3;
    private double total1;
//    set and get for items qty's and totals

    public void setQty(int qty){
        this.qty1 = qty;
//        adds up qty in case someone orders the same type more than once per order
        qty1 += qty;
    }
    public int getQty(){
//        returns the total qty of this type of hat
        return qty1;
    }
    public void setQty2(int qty){
        this.qty2 = qty;
        qty2 += qty;
    }
    public int getQty2(){
        return qty2;
    }
    public void setQty3(int qty){
        this.qty3 = qty;
        qty3 += qty;
    }
    public int getQty3(){
        return qty3;
    }
    public void setTotal(double total){
//        can probably remove the this on this one, but better safe than sorry
        this.total1 = total;
    }
    public double getTotal(){
        return total1;
    }
}
