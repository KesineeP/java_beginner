import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge3 {
    public static void ifThenStatement() {
        //Exercise 1 and 2
        int x = 1;
        int y = 5;

        if(x > y) {
            System.out.format("x is bigger than y by: " +  (x - y));
        } else if(x < y) {
            System.out.println("x is smaller than y by: " + (y - x));
        } else {
            System.out.println("x and y are the same");
        }

        //Exercise 3 and 4
        Scanner scanner = new Scanner(System.in);
        int randomNumber = ThreadLocalRandom.current().nextInt(1,6); 
        System.out.println("Guess a number 1-5:");
        int guessNumber = scanner.nextInt();
        
        if(randomNumber == guessNumber) {
            System.out.println("Correct! Aren't you lucky.");
        }else {         
            System.out.println("Not correct! Guess again!");
            guessNumber = scanner.nextInt();

            if(randomNumber == guessNumber) {
                System.out.println("Correct! Aren't you lucky.");
            }else {
                System.out.println("Hard luck! Maybe next time.");
            }
        }
        scanner.close();
    }
}
