import models.Admin;
import models.Billing;
import models.Item;
import models.Product;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Main {
    static Scanner sc = new Scanner(System.in);

    public static void main(String[] args) {
        Admin a1 = new Admin();
        Item[] items = {
                new Item(10011, "Bed", 34400.67),
                new Item(20011, "Piano", 78666.69),
                new Item(30011, "Book", 890.3),
                new Item(40011, "Pillow", 79),
                new Item(50011, "Laptop", 45000)
        };
        List<Item> itemList = new ArrayList<>();
        List<Item> billItemList=new ArrayList<>();
        for (Item x : items) {
            itemList.add(x);
        }
        Product p=new Product(itemList);
        List<Item> newlist=p.productCustomFunc();
        Billing b=new Billing(newlist);
        b.billFunc();
    }
}