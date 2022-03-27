import java.util.Scanner;

public class NumberGuesser {

    public String getName() {
        Scanner scanner = new Scanner(System.in);
        String name = "";

        while (true) {
            try {
                System.out.println("Hello what is your name ?");
                name = scanner.next();
                if (!name.matches("[a-zA-Z]+") || name.length() <= 0) {
                    return "not a valid name input";
                } else {
                    System.out.println("well hello " + name + ", I am thinking of a number between 1 and 20.");
                    System.out.println("Take a guess.");
                    break;
                }
            } catch (NullPointerException e) {
                System.out.println("Caught Exception: Name cant be empty");
            }
        }
        return name;
    }

    public String getInputNum() {
        Scanner scan = new Scanner(System.in);
        int inputNum;
        String answer;
        double numb = Math.floor(Math.random() * 20) + 1;

        while (true) {
            try {
                System.out.print("Enter any valid Integer between 0 and 20: ");
                inputNum = Integer.parseInt(scan.nextLine());
                if (inputNum <= 0 || inputNum > 20) return "number has to be between 0 and 20";
                if (inputNum > numb) return "your guess is too high";
                else if (inputNum < numb) {
                    return "your guess is too low" ;
                } else {
                    answer = "Correct !";
                    break;
                }
            } catch (NumberFormatException e) {
                System.out.println("Caught Exception: not a valid number input");
            }
        }
        return answer;
    }
}
