import java.util.Scanner;

public class Challenge5 {
    public static void arrays() {
        //Exercise 1
        int[] intArr = new int[10];
        intArr[0] = 12;
        intArr[1] = 3;
        intArr[2] = 43;
        intArr[3] = 67;
        intArr[4] = 77;
        intArr[5] = 89;
        intArr[6] = 3;
        intArr[7] = 4;
        intArr[8] = 83;
        intArr[9] = 91;

        for (int i = 0; i < intArr.length; i++) {
            //System.out.println(intArr[i]);
        }

        //Exercise 2
        int[] array = new int[20];
        for(int i = 0; i < array.length; i++) {
            array[i] = i+1;
        }

        for(int i = array.length -1; i >= 0; i--) {
            //System.out.println(array[i]);
        }

        //Exercise 3
        double[] da = new double[5];
        da[0] = 23.20; 
        da[1] = 12.90; 
        da[2] = 63.50; 
        da[3] = 1.20; 
        da[4] = 10.00;
        
        double sumDa = 0;
        
        for(double ele: da) {
            sumDa += ele;
        }

        double avg = sumDa / da.length;
        System.out.println("Sum value: " + sumDa);
        System.out.println("An avarage value is " + avg);

        //Exercise 4
        String[] favFood = new String[5];
        Scanner scanner = new Scanner(System.in);
        int index = 0;
        
        System.out.println("What are your top 5 favorite food?");
        do {
            System.out.print("Enter your favorite food: ");
            favFood[index] = scanner.nextLine();
            index++;
        }while(index < 3);

        System.out.println("No more memmory available.");
        scanner.close();
    }
}
