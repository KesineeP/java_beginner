import java.util.Scanner;

public class Challenge6 {
    public static void examResults() {
        Scanner scanner = new Scanner(System.in);
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
}
