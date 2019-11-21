import java.util.Scanner;
public class pods {
    //lauren questions:
    //https://edabit.com/challenge/umRwYETG7ogToZhSi
    //1.Create a method that takes an integer as an argument and returns"even" for even integers and "odd" for odd integers.



    //2.
    public static void main (String[] args) {
        Scanner stdin = new Scanner(System.in);
        String x;
        System.out.print("Please enter your favorite food: ");
        x = stdin.nextLine();
        System.out.printf("Wow %s, is my favorite too! \n", x);


        //here is where we call the matches method to see result
        System.out.println(matches("Hello", "HELlo"));
        System.out.println(matches("Goodbye", "bye"));
    }//ends the main method



//https://edabit.com/challenge/D6Lcut2s2gEzdCPvv
//3.Write a function that validates whether two strings are identical. Make it case insensitive.
//ex. match("hello", "hELLo") ➞ true / match("mask", "mAskinG") ➞ false

//have to define that the inputs are strings
    public static boolean matches (String str1, String str2){
        //equalsIgnoreCase compares the strings so that it is case insensitive
        return str1.equalsIgnoreCase(str2);

    }
}
