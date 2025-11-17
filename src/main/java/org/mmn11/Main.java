package org.mmn11;
import org.mmn11.Cashier;
//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        Item item1=new Item("box1",30);
        Item item2=new Item("box2",30);
        Item item3=new Item("box3",30);
        Item item4=new Item("milk",8.90);
        Item item5=new Item("yogurt",12.90);
        Item item6=new Item("apple",12.90);
        Item item7=new Item("flour",3.75);
        Item item8=new Item("water",3.75);
        Cashier cashier1 = new Cashier();
        Cashier cashier3 = new Cashier(1032.78);
        cashier1.setRegister(400);

        /**/
        System.out.println("the register's initial total sum "+cashier3.getRegister());
        cashier1.addItemToPurchase(item1,3);
        cashier1.addItemToPurchase(item4,2);
        cashier1.addItemToPurchase(item3,1);
        cashier1.addItemToPurchase(item8,3);
        System.out.println("customer total purchase is:"+cashier1.cusTotSum());
        System.out.println(cashier1.toString());
        System.out.println("customer's change: "+cashier1.payment(200));
        System.out.println("the register's total sum "+cashier1.getRegister());

        /**/

        System.out.println("the register's initial total sum "+cashier3.getRegister());
        cashier3.addItemToPurchase(item3,3);
        cashier3.addItemToPurchase(item5,2);
        cashier3.addItemToPurchase(item6,1);
        cashier3.addItemToPurchase(item7,3);
        System.out.println("customer total purchase is:"+cashier3.cusTotSum());
        System.out.println(cashier3.toString());
        System.out.println("customer's change: "+cashier3.payment(200));
        System.out.println("the register's total sum "+cashier3.getRegister());

    }
}