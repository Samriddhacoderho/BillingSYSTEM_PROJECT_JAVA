package models;

import java.util.List;

public class Billing{
    List<Item> hereitems;

    public List<Item> getHereitems() {
        return hereitems;
    }

    public void setHereitems(List<Item> hereitems) {
        this.hereitems = hereitems;
    }

    public Billing(List<Item> hereitems) {
        this.hereitems = hereitems;
    }

    public void billFunc()
    {
        hereitems=this.hereitems;
        double total=0;
        int i=1;
        System.out.println("Billing Page:");
        System.out.println("\n\n");
        System.out.println("S.N*************Item ID***************Item Name****************Item Price");
        for(Item x:hereitems)
        {
            System.out.println(i+"************"+x.getItemID()+"*****************"+x.getItemName()+"*****************"+x.getItemPrice());
            total=total+x.getItemPrice();
            i++;
        }
        System.out.println("\nTotal Price:"+total);

    }
}
