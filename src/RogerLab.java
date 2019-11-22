import java.util.Scanner;
public class RogerLab {
    public static void main(String[] args) {
        //Accept and print user name
        Scanner userInput = new Scanner(System.in); //create object of scanner class
        System.out.println("Enter your name: ");
        String user = userInput.nextLine(); //read user input

        System.out.print("You entered: " + user);
        System.out.print("\n");

//        Write a Java program to convert seconds to hour, minute and seconds.
        Scanner in = new Scanner(System.in); //create object of scanner class
        System.out.print("Input seconds: \n"); //enter seconds
        int seconds = in.nextInt(); //set input val to seconds variable
        int p1 = seconds % 60; // get remainder of seconds
        int p2 = seconds / 60; // get minutes
        int p3 = p2 % 60; //get remainder of minutes from hours/minutes
        p2 = p2 / 60; //get total hours (seconds divided by 60 then divided by 60)
        System.out.print(p2 + "hrs : " + p3 + "min : " + p1 + "sec");
        System.out.print("\n");

//        Java Program to Accept Array Elements and Calculate Sum

        int n, sum = 0; //create variables
        Scanner s = new Scanner(System.in);
        System.out.print("Enter no. of elements you want in array: \n");
        n = s.nextInt(); //number of elements
        int a[] = new int[n]; // each element bucket
        System.out.println("Enter all the elements: ");
        for (int i = 0; i < n; i++) {
            a[i] = s.nextInt();
            sum = sum + a[i]; //adding each element to previous amount
        }
        System.out.println("Sum: " + sum);
    }
}
//test


