package es.uah.matcomp.mp.e1.ejerciciosclases.Practica1.InvoiceItem;

public class InvoiceItem {
    private String id;
    private String desc;
    private int qty;
    private double unitPrice;

    public InvoiceItem(String idU,String descU, int qtyU, double unitPriceU){
        id=idU;
        desc=descU;
        qty=qtyU;
        unitPrice=unitPriceU;

    }
    public String getId(){
        return id;
    }
    public String getDesc(){
        return desc;
    }
    public int getQty(){
        return qty;
    }
    public double getUnitPrice(){
        return unitPrice;
    }
    public double getTotal(){
        return unitPrice * qty;
    }
    public void setQty( int newQty){
        qty = newQty;

    }
    public void setUnitPrice(double newUnitPrice){
        unitPrice= newUnitPrice;
    }
    public String toString(){
        return "InvoiceItem[id= "+ id + "desc = " + desc + ", qty = " + qty + ", unitPrice = " + unitPrice + "]";
    }
}
