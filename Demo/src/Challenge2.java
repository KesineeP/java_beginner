import java.util.Scanner;

public class Challenge2 {
    public static void userInput() {
        Scanner scanner = new Scanner(System.in);
        
        //Exercise 1
        System.out.println("What is your name?");
        String userName = scanner.next();
        
        System.out.println("\nHow old are you?");
        int userAge = scanner.nextInt();
        
        System.err.println("\nYou've lived " + userAge + " years. In another " + userAge + " you'll be " + userAge*2 + " years old.");
        System.out.format("You have %d characters in your name.", userName.length());

        //Exercise 2
        System.out.println("\nRestaurant Bill Calculation");
        System.out.println("How much is the bill total?");
        double billAmount = scanner.nextDouble();

        System.out.println("How many people?");
        int peopleNumber = scanner.nextInt();
        scanner.close();
        
        double amount = billAmount / peopleNumber;
        System.out.format("Each person should pay %.2f dollars.", amount);
        System.out.println();
    }
}
