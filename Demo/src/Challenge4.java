import java.util.Scanner;

public class Challenge4 {
    public static void loops() {

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
//        Scanner scanner = new Scanner(System.in);
//        System.out.println("Please enter your password: ");
//        String inputPassword = scanner.next();
        
//        do {
//          System.out.println("Incorrect password, please try again");
//          System.out.println("Enter your password: ");
//          inputPassword = scanner.next();
//        } while(!inputPassword.equals("shark50"));
//      
//          System.out.println("ACCESS APPROVED");
//          scanner.close();

        //Exercise 4
        int i = 0;
        String output = "";
        while(i < 11) {
            output = output + i + ", ";
            i++;
        }
        System.out.println(output);
    }
}
