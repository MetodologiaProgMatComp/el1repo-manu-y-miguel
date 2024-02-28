public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;
    public InvoiceItem(String i,String d,int q,double price) {
        id= i;
        desc=d;
        qty=q;
        unitPrice=price;
    }
    public String getId() {
        return id;}

    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;}
    public void setQty(int newqty){
        this.qty=newqty;
    }
    public double getUnitPrice(){
        return unitPrice;}
    public void setUnitPrice(double newprice){
        this.unitPrice= newprice;}
    public double getTotal() {
        return unitPrice * qty;}
    public String toString(){
        return "InvoiceItem[id= "+id+",desc= "+desc+",qty= "+qty+",unitPrice= "+unitPrice+"]";}
}
