import java.util.Scanner;

public class Challenge2 {
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        
        //Exercise 1
        System.out.println("What is your name?");
        String userName = scanner.next();
        
        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        scanner.close();
        
        System.err.println("\nYou've lived " + userAge + " years. In another " + userAge + " you'll be " + userAge*2 + " years old.");
        System.out.format("You have %d characters in your name.", userName.length());
    }
}
