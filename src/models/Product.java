package models;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public class Product {
    Scanner sc = new Scanner(System.in);
    List<Item> itemList;

    public Product(List<Item> itemList) {
        this.itemList = itemList;
    }

    public List<Item> getItemList() {
        return itemList;
    }

    public void setItemList(List<Item> itemList) {
        this.itemList = itemList;
    }

    Product()
    {
        System.out.println("");
    }
    public List<Item> productCustomFunc() {
        int c = 0;
        int quant = 0;
        int i = 0;
        List<Item> herelist = this.itemList;
        List<Item> newlist=new ArrayList<>();
        while (i == 0) {
            System.out.println("Enter ItemID or press 0 to make bill:");
            int adminIDtake = sc.nextInt();
            if (adminIDtake == 0) {
                i=1;
            }
            else {
                Iterator<Item> iter=herelist.iterator();
                while(iter.hasNext())
                {
                    Item x=iter.next();
                    if(x.getItemID()==adminIDtake)
                    {
                        while(c==0) {
                            System.out.println("Enter quantity:");
                            quant = sc.nextInt();
                            if (quant > x.getItemQuantity() || quant <= 0) {
                                System.out.println("Quantity Not Available");
                            }
                            else
                            {
                                c=1;
                            }
                        }
                        x.setItemQuantity(quant);
                        c=1;
                        newlist.add(x);
                        iter.remove();
                    }
                }
                if (c != 1){
                    System.out.println("Item Not Found");
                }
                c=0;
            }
        }
        return newlist;
    }
}
