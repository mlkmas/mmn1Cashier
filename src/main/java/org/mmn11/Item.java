package org.mmn11;

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
        return "item name: "+name+ " price: "+price;
    }
}
