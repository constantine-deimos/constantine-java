import java.text.NumberFormat;
import java.util.Scanner;


public class ShoppingCartItems {
    //set the total cost of shopping cart
    private String item;
    private double price;
    private double quantity;

    //constructor
    public ShoppingCartItems(String itemName, double priceItem, double quantityItem){
        item = itemName;
        price = priceItem;
        quantity = quantityItem;
    }
    public String getItem (){
        return item;
    }
    public double getPrice(){
        return price;
    }
    public double getQuantity (){
        return quantity;
    }

    //return a string with the info of item
    @Override
    public String toString (){
        NumberFormat fmformat = NumberFormat.getCurrencyInstance();
        String stringtb = item.length() > 10 ? "\t" : "\t\t";
        return item + stringtb + fmformat.format (price) + "\t\t" + quantity + "\t\t" + fmformat.format (price * quantity);
    }
}
