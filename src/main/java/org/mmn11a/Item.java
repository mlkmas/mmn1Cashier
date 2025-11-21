package org.mmn11a;

public class Item
{
    private double price;
    private String name;

    public Item(String name, double price)
    {
        this.name = name;
        this.price = price;
    }

     public double getPrice()
    {
        return price;
    }
    public String toString()
    {
        return "item name: "+name+ " price: "+price+" ";
    }
    public void setPrice(double newPrice)
    {
        this.price=newPrice;
    }
    public String getName()
    {
        return name;
    }
    public void setName(String newName)
    {
        this.name=newName;
    }
}
