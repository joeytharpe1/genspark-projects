package com.codewithjoey;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Scanner scanner = new Scanner(System.in);
        double numb = Math.floor(Math.random() * 20);
        System.out.println("Hello what is your name ?");
        String name = scanner.nextLine();
        System.out.println("well hello " + name + ", I am thinking of a number between 1 and 20.");
        System.out.println("Take a guess.");

        while(true){
            double inputNum = scanner.nextDouble();
            if(inputNum > numb){
                System.out.println("your guess is too high");
            } else if(inputNum < numb){
                System.out.println("your guess is too low");
            } else {
                System.out.println("Correct !");
                break;
            }
        }
    }
}
