package org.mmn11;
import java.util.Vector;

public class Cashier
{
    private double register;//amount in the register
    private Vector<receiptLine> receiptLines;//current customer's purchase receipt

    public Cashier()
    {
        this.register=0;

        this.receiptLines = new Vector<>();
    }
    public Cashier(double register)
    {
        this.register=register;

        this.receiptLines = new Vector<>();
    }
    // a method for adding an item to the purchase
    public void addItemToPurchase(Item item,int quantity)
    {
        receiptLine e=new receiptLine(item,quantity);
        this.receiptLines.add(e);
    }
    //current customer's receipt
    public String toString()
    {
        String s="";
        for( receiptLine it: receiptLines)
        {
            s+= it.toString()+"/n";
        }
        return s;
    }
    public double cusTotSum()
    {
        double sum=0;
        for (receiptLine it: receiptLines)
        {
            sum+=it.getUnitPrice();
        }
        return sum;
    }
    public double payment(double amount)
    {
        double purchasePrice=this.cusTotSum(),sum=amount-purchasePrice;
        register+=sum;
        this.receiptLines = new Vector<>();
        return sum;

    }
public double getRegister()
{
    return register;
}

    public void setRegister(double register)
    {
        this.register = register;
    }
}
