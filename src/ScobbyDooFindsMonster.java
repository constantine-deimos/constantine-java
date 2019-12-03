import java.util.Scanner;

public class ScobbyDooFindsMonster {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);


            MonsterIdenity 	Creeper = new MonsterIdenity("Mr. Carswell", "Creeper");

            System.out.println("Scooby Doo and the gang are investigating a monster!!");
            scanner.nextLine();

            //show the type of monster
            System.out.println("OH Jeepers! Shaggy finds out that the monster is " + Creeper.getMonsterName() + "!");
            scanner.nextLine();

            //set the trap
            System.out.println("Fred sets a trap! So the gang sets out to catch " + Creeper.getMonsterName() + "!");
            scanner.nextLine();

            //ask them if they want to unmask the monster
            System.out.println("Jinkies we caught " + Creeper.getMonsterName() + "!");
            scanner.nextLine();

            System.out.println("Do you want to unmask the monster? (Y/N)");
            String yesNo;

            yesNo = scanner.nextLine();

            if (yesNo.equalsIgnoreCase("y")){

                System.out.println(" You unmasked the monster! The monster was actually " + Creeper.getMonsterIdenity());
            }
            else {
                System.out.println("The monster got away!");

            }

        }
    }

