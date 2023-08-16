/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author shavionanayakkara
 */
public abstract class item {
    abstract void makeConnection();

    /**
     * @return the Itemcode
     */
    public String getItemcode() {
        return Itemcode;
    }

    /**
     * @param Itemcode the Itemcode to set
     */
    public void setItemcode(String Itemcode) {
        this.Itemcode = Itemcode;
    }

    /**
     * @return the ItemName
     */
    public String getItemName() {
        return ItemName;
    }

    /**
     * @param ItemName the ItemName to set
     */
    public void setItemName(String ItemName) {
        this.ItemName = ItemName;
    }

    /**
     * @return the ItemPrice
     */
    public int getItemPrice() {
        return ItemPrice;
    }

    /**
     * @param ItemPrice the ItemPrice to set
     */
    public void setItemPrice(int ItemPrice) {
        this.ItemPrice = ItemPrice;
    }

    /**
     * @return the ItemType
     */
    public String getItemType() {
        return ItemType;
    }

    /**
     * @param ItemType the ItemType to set
     */
    public void setItemType(String ItemType) {
        this.ItemType = ItemType;
    }
    
    private String Itemcode;
    private String ItemName;
    private int ItemPrice;
    private String ItemType;
    
    public void addItem(item obj)
    {
        String itemString = obj.getItemcode() + " " + obj.getItemName() + " " + String.valueOf(obj.getItemPrice()+ " " + obj.getItemType());
        DBconnection con = new DBconnection();
        con.makeConnection(itemString,"Item.txt");
    }
}
