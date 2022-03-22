package com.codewithjoey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);

        System.out.println("You are in a land full of Dragons. In front of you,");
        System.out.println("you see two caves. In one cave, the dragon is friendly");
        System.out.println("and will share his treasures with you. The other dragon");
        System.out.println("is greedy and hungry and will eat you on sight.");
        System.out.print("Which cave will you go into? (1 or 2) :");

        int answer = scanner.nextInt();
        if(answer == 1){
            System.out.println("You approach the cave...");
            System.out.println("it is dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his jaws and...");
            System.out.println("Gobbles you down in one bite !");
        } else if(answer == 2) {
            System.out.println("You approach the cave...");
            System.out.println("it is not so dark and spooky...");
            System.out.println("A large dragon jumps out in front of you! He opens his hands and...");
            System.out.println("Gives you lots of gold and food !");
        } else {
            System.out.println("Sorry wrong number u cant escape the dragons would u like to retry ?");
        }
    }
}
