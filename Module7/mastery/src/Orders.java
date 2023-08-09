public class Orders {

    private int qty1;
    private int qty2;
    private int qty3;
    private double total1;
//    set and get for items and qty's

    public int getHatType3(int count3){
        return count3;
    }
    public void setQty(int qty){
        this.qty1 = qty;
        qty1 += qty;
    }
    public int getQty(){
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
        this.total1 = total;
        total1 += total;
    }
    public double getTotal(){
        return total1;
    }
}
