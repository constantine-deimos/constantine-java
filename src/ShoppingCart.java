import java.awt.event.ItemEvent;
import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        String itemName;
        double itemPrice;
        double itemQuanity;

        ArrayList <ShoppingCartItems> cart = new ArrayList <ShoppingCartItems>();
        Scanner scanner = new Scanner(System.in);


        String keepShopping = "yes";
        //set the total of the shopping cart to 0
        double totalAmount = 0;

        do {
            System.out.println("Enter the item you want to add: ");
            //set the input to the item name
            itemName = scanner.nextLine();

            System.out.println("Enter the price for " + itemName + " : ");
            //set the input to the item price
            itemPrice = scanner.nextDouble();

            System.out.println("Enter the quantity of " + itemName + " that you want: ");
            //set the input to the quantity of items
            itemQuanity = scanner.nextDouble();

            //find out the totalAmount in the cart
            totalAmount += (itemPrice * itemQuanity);

            //==create a new item that will get added to the cart==//
            ShoppingCartItems newItem = new ShoppingCartItems(itemName, itemPrice, itemQuanity);

                //cart is called from the ArrayList
            cart.add(newItem);


            //show the items in the shoppingCart
            for (int i = 0; i < cart.size(); i++){
                //what you have in your cart
                System.out.println("This is what you have in your shopping cart:");
                System.out.println(cart.get(i));
            }
            System.out.println("Your total price in the shopping cart: " + totalAmount);

            //ask user if they want to keep shopping
            System.out.println("Do you want to continue shopping? (YES/NO)");
            keepShopping = scanner.next();

        }while (keepShopping.equalsIgnoreCase("yes"));
    }

}
