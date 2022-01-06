public class InvoiceItems{

    int id;
    String desc;
    int qty;
    double unitPrice;

    public InvoiceItems(int id,String desc,int qty,double unitPrice){

        this.id=id;
        this.desc=desc;
        this.qty = qty;
        this.unitPrice = unitPrice;


    }

    protected int getID(){
        return this.id;
    }

    protected String getDesc(){
        return this.desc;
    }

    protected int getQty(){
        return this.qty;
    }

    protected void setQty(int newQty){
        this.qty = newQty;
    }

    protected double getUnitPrice(){
        return this.unitPrice;
    }

    protected void setUnitPrice(double newUnitPrice){
        this.unitPrice = newUnitPrice;
    }

    protected double getTotal(){
        return this.unitPrice * this.qty;
    }

    public String toString(){
        return "Invoice Items : id -> "+this.id+" desc : "+this.desc+" quantity: "+this.qty+" unitPrice "+this.unitPrice;
    }



}