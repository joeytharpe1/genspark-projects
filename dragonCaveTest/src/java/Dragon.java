import java.util.InputMismatchException;
import java.util.Scanner;

public class Dragon {

    public String getDragon() {
        String dragonCave = "";
        Scanner scanner = new Scanner(System.in);
        try {
            int answer = scanner.nextInt();
            System.out.println("You are in a land full of Dragons. In front of you,");
            System.out.println("you see two caves. In one cave, the dragon is friendly");
            System.out.println("and will share his treasures with you. The other dragon");
            System.out.println("is greedy and hungry and will eat you on sight.");
            System.out.print("Which cave will you go into? (1 or 2) :");

            if (answer == 1) {
               dragonCave = "You approach the dark cave, A large dragon jumps out in front of you and eats you";
            } else if (answer == 2) {
                dragonCave = "You approach a nice cave A small dragon jumps out in front of you! Gives you lots of food !";
            } else {
                dragonCave = "Sorry wrong number u cant escape the dragons would u like to retry ?";
            }

        } catch (InputMismatchException e) {
            System.out.println("Caught Exception: not a valid number input");
        }
        return dragonCave;
    }

}
