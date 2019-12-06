import java.util.Scanner;

//inheritance/polymorphism

public class ScobbyDooFindsMonster {
    public static void main(String[] args) {
            Scanner scanner = new Scanner(System.in);

            //create the monster
            MonsterIdentity Creeper = new MonsterIdentity("Mr. Carswell", "Creeper");


            System.out.println("A monster was seen robbing the bank!!");
            scanner.nextLine();

            System.out.println("Scooby Doo and the gang were called to investigating the monster!!");
            scanner.nextLine();

            System.out.println("Mystery Inc encounters the monster!");
            System.out.println("Montage of the gang running away from the monster...");
            scanner.nextLine();


        //===show the type of monster===//

            System.out.println("OH Jeepers! Shaggy finds out that the monster is called " + Creeper.getMonsterName() + "!");
            scanner.nextLine();

            //set the trap
            System.out.println("Fred sets a trap! So the gang sets out to catch " + Creeper.getMonsterName() + "!");
            scanner.nextLine();

            System.out.println("The trap was triggered....");
            System.out.println("Jinkies we caught " + Creeper.getMonsterName() + "!");
            scanner.nextLine();

        //====unmask the monster=======//

            System.out.println("Do you want to unmask the monster? (Y/N)");
            String yesNo;
            yesNo = scanner.nextLine();

            if (yesNo.equalsIgnoreCase("y")){

                //show monsters real identity
                System.out.println(" You unmasked the monster! The monster was actually " + Creeper.getMonsterIdentity());
            }
            else {
                System.out.println("The monster got away!");

            }

        }
    }

