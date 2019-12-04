import java.util.ArrayList;
import java.util.Scanner;

public class ShoppingCart {
    public static void main(String[] args) {
        String itemName;
        double itemPrice;
        double itemQuantity;

        ArrayList <ShoppingCartItems> cart = new ArrayList <>();
        Scanner scanner = new Scanner(System.in);


        String keepShopping = "yes";
        //set the total of the shopping cart to 0
        double totalAmount = 0;
        System.out.println("Welcome to Fridgefetch!");
        scanner.nextLine();
        do {
            System.out.println("Enter an item you want to add to your cart: ");
            //set the input to the item name
            itemName = scanner.next();

            System.out.println("Enter the price for " + itemName + " : ");
            //set the input to the item price
            itemPrice = scanner.nextDouble();

            System.out.println("Enter the quantity of " + itemName + " that you want: ");
            //set the input to the quantity of items
            itemQuantity = scanner.nextDouble();

            //find out the totalAmount in the cart
            totalAmount += (itemPrice * itemQuantity);

            //===create a new item that will get added to the cart====//
            ShoppingCartItems newItem = new ShoppingCartItems(itemName, itemPrice, itemQuantity);

                //cart is called from the ArrayList
            cart.add(newItem);


            //show the items in the shoppingCart
            System.out.println("This is what you have in your shopping cart:");
            System.out.println("Item  |  Price |  Qty |  Total");
            System.out.println("--------------------------------");
                //.size is the size of the list
            for (int i = 0; i < cart.size(); i++){
                //what you have in your cart (.get gets the element present in the list at that given index)
                System.out.println(cart.get(i));
            }
            System.out.println("-------------------");
            System.out.println("Total: " + "$" + totalAmount);

            //ask user if they want to keep shopping
            System.out.println("Do you want to continue shopping? (YES/NO)");
            keepShopping = scanner.next();

        }
        while (keepShopping.equalsIgnoreCase("YES"));
        System.out.println("You finished shopping!");
    }

}
