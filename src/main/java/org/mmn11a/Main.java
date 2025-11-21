package org.mmn11a;
import java.util.Scanner;
import java.util.Vector;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

public class Main {

    static public Item getItemByName(String itemName,Vector<Item> items)
    {
        for (Item item : items)
        {
            if(item.getName().equals(itemName))
                return item;
        }
        return null;
    }
    public static void main(String[] args) {
        Vector<Item> items = new Vector<>();

        Item item1=new Item("box1",30);
        Item item2=new Item("box2",30);
        Item item3=new Item("box3",30);
        Item item4=new Item("milk",8.90);
        Item item5=new Item("yogurt",12.90);
        Item item6=new Item("apple",12.90);
        Item item7=new Item("flour",3.75);
        Item item8=new Item("water",3.75);
        items.add(item1);
        items.add(item2);
        items.add(item3);
        items.add(item4);
        items.add(item5);
        items.add(item6);
        items.add(item7);
        items.add(item8);


        Cashier cashier1 = new Cashier();
        Scanner scan=new Scanner(System.in);
        int userInput=0,itemQuan=0,i=1;
        String itemNum="";
        System.out.println("Welcome to Cashier Calculator\n");
        while(userInput<5)
        {
            System.out.println("Please choose an option:\n" + "1. Show the items' catalog and add an item to the purchase\n"
            + "2.Show current receipt\n" + "3.Finalize payment\n" + "4.Check total money in register\n" + "5. Exit\n");
            userInput=scan.nextInt();
            scan.nextLine();
            switch (userInput)
            {
                case 1:
                    for(Item item:items)
                    {
                        System.out.println(i+ item.toString());
                    }
                    while (!itemNum.equals("0"))
                    {
                        System.out.println("Please enter the item  you would like to purchase, or checkout!\n");
                        itemNum=scan.nextLine();
                        if(itemNum.equals("0"))
                        {
                            userInput=3;
                            break;
                        }
                        else{
                            System.out.println("Please enter the quantity you would like to purchase\n");
                            itemQuan=scan.nextInt();
                            scan.nextLine();//empty buffer just in case
                            cashier1.addItemToPurchase(getItemByName(itemNum,items),itemQuan);
                        }

                    }

                case 2:
                    System.out.println(cashier1);
                    break;
                case 3:
                    System.out.println(cashier1);
                    System.out.println("The total payment is: "+cashier1.cusTotSum() +" ,please enter your payment:\n");
                    cashier1.payment(scan.nextDouble());
                    scan.nextLine();
                    System.out.println("Thank you for using Cashier Calculator\n");
                    userInput=6;
                    break;
                case 4:
                    System.out.println("the register's total sum "+cashier1.getRegister());
                    break;
                case 5:
                    System.exit(0);

            }
        }

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