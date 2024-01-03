import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge4 {
    public static void loops() {
        Scanner scanner = new Scanner(System.in);

        //Exercise 1
        //for(int i = 89; i <= 117; i++) {
        //    System.out.println(i);
        //}

        //Exercise 2
        //for(int i = 1; i < 41; i++) {
        //    if(i % 3 == 0) {
        //        System.out.println("Quack");
        //    }else {
        //        System.out.println(i);
        //    }
        //}

        //Exercise 3
        // System.out.println("Please enter your password: ");
        // String inputPassword = scanner.next();
 
        // do {
        //   System.out.println("Incorrect password, please try again");
        //   System.out.println("Enter your password: ");
        //   inputPassword = scanner.next();
        // } while(!inputPassword.equals("shark50"));
      
        //   System.out.println("ACCESS APPROVED");
       

        //Exercise 4
        //First approach
         int i = 0;
         String output = "";
         while(i < 11) {
            if(i == 10) {
                output = output + i;
            }else {
                output = output + i + ", ";
            }
            i++;
         }
         System.out.println(output + ".");

        //Second approach
        //for(int i = 0; i <= 10; i++) {
        //   System.out.print(i + ", ");
        //}
        //System.out.println("\b\b.");

        //Exercise 5 + 6
        int randomNumber = ThreadLocalRandom.current().nextInt(1,101);
        System.out.println("Guess a number 1-100:");
        int guess = scanner.nextInt();
        int countGuess = 0;

        do {
            if(guess > randomNumber) {
                System.out.println("LOWER");
                System.out.println("Guess number again:");
                guess = scanner.nextInt();
                countGuess++;
            }else {
                System.out.println("HIGHER");
                System.out.println("Guess number again:");
                guess = scanner.nextInt();
                countGuess++;
            }
        }while(randomNumber != guess);      
        System.out.println("Correct! It took you " + countGuess + " times to guess the correct number!");
        scanner.close();
    }
}
