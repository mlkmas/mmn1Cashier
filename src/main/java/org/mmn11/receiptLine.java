package org.mmn11;

public class receiptLine
{
    private Item item;
    private int quantity;
    private double unitPrice;
    public receiptLine(Item item,int quantity)
    {
        this.item=item;
        this.quantity=quantity;
        this.unitPrice=quantity*item.getPrice();
    }

    public String toString()
    {
        return item.toString()+"quantity:"+quantity+"unitPrice:"+unitPrice;
    }
    public double getUnitPrice()
    {
        return unitPrice;
    }
}
