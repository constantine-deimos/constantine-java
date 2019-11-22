import java.util.Scanner;
public class Pods {
    //lauren questions:

    public static void main (String[] args) {
        //in means input
        Scanner scanner = new Scanner(System.in);

        //=========what is your favorite food?======
        String x;
        System.out.print("Please enter your favorite food: ");
        x = scanner.nextLine();
        //may need to change \n
        System.out.printf("Wow %s, is my favorite too! \n", x);

        //============for farmer question================
        scanner.nextLine();

        System.out.println("Hello farmer ");
        System.out.println("How many chickens do you have? ");
        int chicken = scanner.nextInt();

        System.out.println("How many cows do you have?  ");
        int cows = scanner.nextInt();

        System.out.println("How many pigs do you have?  ");
        int pigs = scanner.nextInt();

        chicken = chicken * 2;
        cows = cows * 4;
        pigs = pigs * 4;

        int totalLegs = (chicken + cows + pigs);
        System.out.println("The total amount of farm animal legs is: \n" + totalLegs);

        //=========for area of a triangle===============
        scanner.nextLine();
        System.out.println("Enter the base of the triangle:  ");
        int base = scanner.nextInt();

        System.out.println("Enter the height of the triangle:  ");
        int height = scanner.nextInt();

        int area = (base * height)/2;
        System.out.printf("The area of the triangle is: %s\n" , area);




    }

}
