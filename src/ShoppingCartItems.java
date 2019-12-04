import java.text.NumberFormat;

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
    public String toString (){
        NumberFormat fmt = NumberFormat.getCurrencyInstance();

            //.format returns a formatted string
        return (item + "\t" + fmt.format(price) + "\t" + quantity + "\t" + fmt.format(price * quantity));
    }
}
