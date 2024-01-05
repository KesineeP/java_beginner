import java.util.Scanner;
import java.util.concurrent.ThreadLocalRandom;

public class Challenge6 {
    static Scanner scanner = new Scanner(System.in);
    
    public static void examResults() {
        exercise4();
    }
   
    public static void exercise1() {
        System.out.println("How many student took the exam?");
        int numOfStudents = scanner.nextInt();
        
        System.out.println("What is the maximum of the score?");
        int maxScore = scanner.nextInt();
        
        int[] scores = new int[numOfStudents];
        int sumScore = 0;
        System.out.println("Please enter student's score");
        for(int student = 1; student <= numOfStudents; student++) {
            System.out.print("Student " + (student) +  ":");
            int score = scanner.nextInt();
            
            while(score > maxScore){
                System.out.println("Score must be 1-"+ maxScore+ ". Please enter correct score.");
                System.out.print("Student " + (student) +  ":");
                score = scanner.nextInt();
            };

            scores[student-1] = score;
            sumScore = sumScore + score;
        }
        //formular finding percentage of student's score--> (score/max) * 100 
        //print out each student score and percentage of the exam
        for(int i = 0; i < scores.length; i++) {
            double studentScore = scores[i];
            double percentage = (studentScore/maxScore) * 100;
            System.out.println("Student " + (i+1) + ": " + studentScore + "/" + maxScore + " (" + percentage + "%)");
        }

        //print out the average score and percentage of the exam
        double mean = sumScore / scores.length;
        double meanPercentage = mean / maxScore * 100;

        System.out.println("Mean score: " + mean + "/" + maxScore +"(" + meanPercentage + "%");
        scanner.close();
    }

    public static void exercise2() {

        String[] questions = new String[] {
            "We are in 20th century",
            "The United States of America is located in North America",
            "The capital of Thailand is Bangkok",
            "Tertles are amphibians",
            "Michael jackson have thirty-five compilation albums",
        };

        boolean[] answers = new boolean[] {false, true, true, false, true};
        boolean[] userAnswers = new boolean[5];

        //loop questions
        System.out.println("Please enter true/false on each stataement");
        for(int i = 0; i < questions.length; i++) {
            System.out.print("Is this statement true or false '" + questions[i] + "': ");
            userAnswers[i] = scanner.nextBoolean();
        }
        scanner.close();

        int score = 0;
        for(int i = 0; i < answers.length; i++) {
            if(answers[i] == userAnswers[i]) score++;
        }

        switch (score) {
            case 5:
                System.out.println("Excellent! Your score: " + score);
                break;
            case 4:
                System.out.println("Good job! Your score: " + score);
                break;
            case 3:
                System.out.println("Not bad! Your score: " + score);
                break;
            case 2:
            case 1:
                System.out.println("Not so good! Your score: " + score);
                break;
            default:
                System.out.println("Google can help you! Your score: " + score);
                break;
        }
    }

    public static void exercise3() {
        System.out.println("-----Guess my number game-----");
        System.out.println("-----Rules-----");
        System.out.println("Think of a number from 1-100 and I will try to guess it");
        System.out.println("Enter \"higher\" if my guess is too low");         
        System.out.println("Enter \"lower\" if my guess is too high");  
        
        String input;
        int min = 1;
        int max = 100;

        while(true) {
            int randomNumber = ThreadLocalRandom.current().nextInt(min,max+1);
            System.out.println("I'm guessing: " + randomNumber );
            System.out.println("Your response: ");
            input = scanner.next();
            
            if(input.equals("higher")) {
                min = randomNumber + 1;
            }else if(input.equals("lower")) {
                max = randomNumber - 1;
            }else if(input.equals("correct")) {
                System.out.println("Congrat! " + randomNumber + " is correct!");
                break;
            }
            
            if(min == max+1) {
                System.out.println("That is not possible. Let's try again");
                min = 1;
                max = 101;
            }
            
        }
    }

    public static void exercise4() {
        System.out.println("-----Guess my number game-----");
        System.out.println("-----Rules-----");
        System.out.println("Think of a number from 1-100 and I will try to guess it");
        System.out.println("Enter \"higher\" if my guess is too low");         
        System.out.println("Enter \"lower\" if my guess is too high");  
        
        String input;
        int min = 1;
        int max = 100;
        int guess = 50;

        while(true) {
            System.out.println("I'm guessing: " + guess);
            System.out.println("Your response: ");
            input = scanner.next();
            
            if(input.equals("higher")) {
                min = guess + 1;
            }else if(input.equals("lower")) {
                max = guess - 1;
            }else if(input.equals("correct")) {
                System.out.println("Congrat! " + guess + " is correct!");
                break;
            }

            guess = (min + max) / 2;
            
            if(min == max+1) {
                System.out.println("That is not possible. Let's try again");
                min = 1;
                max = 100;
                guess = 50;
            }
        }
    }
}
