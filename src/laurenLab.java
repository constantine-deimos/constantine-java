import java.util.Arrays;
import java.util.Scanner;

public class laurenLab {
    //===========ONE================//
    //enter the length of a string array
    public static void main (String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter the length you want for the array: ");
        int arrayLength = scanner.nextInt();

        //next create a sting array that saves the users input
        String[] input = new String[arrayLength];

        //loop over the array so that you save the user input
        System.out.println("Enter the elements in the array");
        for (int i=0; i< arrayLength; i++){
            String elementsInput = scanner.next();

            input[i] = elementsInput;
        }

        //print out the array that they entered
        System.out.println("The Array of elements that you entered : ");
        System.out.println(Arrays.toString(input));

    }
    // of coin tosses (true=heads, false=tails),
    //to see if you can get

}