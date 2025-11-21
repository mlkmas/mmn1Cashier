package org.mmn11a;

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
        return item.toString()+" quantity: "+quantity+" unitPrice: "+unitPrice;
    }
    public double getUnitPrice()
    {
        return unitPrice;
    }
    public int getQuantity()
    {
        return quantity;
    }
    public Item getItem()
    {
        return item;
    }
    public void setItem(Item item)
    {
        this.item = item;
    }
    public void setUnitPrice()
    {
        this.unitPrice=quantity*item.getPrice();
    }
    public void setQuantity(int newQuantity)
    {
        this.quantity=newQuantity;
        this.setUnitPrice();
    }

}

