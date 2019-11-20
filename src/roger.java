import java.util.Scanner;
public class roger {
    public static void main(String[] args) {
        //Accept and print user name
        Scanner userInput = new Scanner(System.in); //create object of scanner class
        System.out.println("Enter your name: ");
        String user = userInput.nextLine(); //read user input

        System.out.print("You entered: " + user);
        System.out.print("\n");

//        Write a Java program to convert seconds to hour, minute and seconds.
        Scanner in = new Scanner(System.in); //create object of scanner class
        System.out.print("Input seconds: "); //enter seconds
        int seconds = in.nextInt(); //set input val to seconds variable
        int p1 = seconds % 60; // get remainder of seconds
        int p2 = seconds / 60; // get minutes
        int p3 = p2 % 60; //get remainder of minutes from hours/minutes
        p2 = p2 / 60; //get total hours (seconds divided by 60 then divided by 60)
        System.out.print( p2 + ":" + p3 + ":" + p1);
        System.out.print("\n");



    }

}
