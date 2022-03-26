package com.codewithjoey;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        int inputNum;
        String name;
        Scanner scanner = new Scanner(System.in);
        double numb = Math.floor(Math.random() * 20) + 1;

        while(true) {
            try {
                System.out.println("Hello what is your name ?");
                name = scanner.next();
                if (!name.matches("[a-zA-Z]+") || name.length() <= 0) {
                    System.out.println("not a valid name input");
                } else {
                    System.out.println("well hello " + name + ", I am thinking of a number between 1 and 20.");
                    System.out.println("Take a guess.");
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Caught Exception: Name cant be empty");
            }
        }

        while(true) {
            System.out.print("Enter any valid Integer between 0 and 20: ");
            try {
                inputNum = Integer.parseInt(scanner.next());
                if(inputNum == 0 || inputNum > 20) System.out.println("number has to be between 0 and 20");
                if (inputNum > numb) {
                    System.out.println("your guess is too high");
                } else if (inputNum < numb) {
                    System.out.println("your guess is too low");
                } else {
                    System.out.println("Correct !");
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Caught Exception: not a valid number input");
            }
        }
    }
}
