package models;

public class Item {
    int itemID;
    String itemName;
    double itemPrice;
    int itemQuantity;

    public int getItemID() {
        return itemID;
    }

    public void setItemID(int itemID) {
        this.itemID = itemID;
    }

    public String getItemName() {
        return itemName;
    }

    public void setItemName(String itemName) {
        this.itemName = itemName;
    }

    public double getItemPrice() {
        return itemPrice;
    }

    public void setItemPrice(double itemPrice) {
        this.itemPrice = itemPrice;
    }

    public int getItemQuantity()
    {
        return  itemQuantity;
    }
    public void setItemQuantity(int itemQuantity)
    {
        this.itemQuantity=itemQuantity;
    }

    public Item(int itemID, String itemName, double itemPrice,int itemQuantity) {
        this.itemID = itemID;
        this.itemName = itemName;
        this.itemPrice = itemPrice;
        this.itemQuantity=itemQuantity;
    }
}
