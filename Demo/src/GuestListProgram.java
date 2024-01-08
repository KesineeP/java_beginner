import java.util.Scanner;

public class GuestListProgram {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
    public static void guestList() {

       insertTestNames();

        do {
            displayGuests();
            displayMenu();
            int option = getOption();
            System.out.println();

            if(option == 1) {
                addGuest();
            }
             else if(option == 2) {
                insertGuest();
            }
            else if(option == 3) {
                renameGuest();
            }
            else if(option == 4) {
                removeGuest();
            }
            else if(option == 5) {
                System.out.println("Exit...");
                break;
            }
        }while(true);

        scanner.close();
    }

    static void displayGuests() {
        System.out.println("_______________________________\n- Guests -\n");
        boolean isEmpty = true;
            for (int i = 0; i < guests.length; i++) {
                if(guests[i] != null) {
                    System.out.println((i + 1) + ". " + guests[i]);
                    isEmpty = false;
                }
            }
        if(isEmpty) System.out.println("Guest list is empty.");

    }
    
    static void displayMenu() {
        System.out.println("_______________________________\n- Menu -\n");
            System.out.println("1 - Add Guest");
            System.out.println("2 - Insert Guest");
            System.out.println("3 - Rename Guest");
            System.out.println("4 - Remove Guest");
            System.out.println("5 - Exit");
    }

    static int getOption() {
        System.out.print("Option: ");
        int options = scanner.nextInt();
        scanner.nextLine();
        System.out.println();
        return options;
    }

    static void addGuest() {
        for (int i = 0; i < guests.length; i++) {
                    if(guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.nextLine();
                        break;
                    }
                }
    }

    static void insertGuest() {
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();

        if(number >= 10 && number < 0 && guests[number-1] != null) {
            System.out.print("Name: ");
            String newName = scanner.nextLine();
            
            for(int i = guests.length -1; i > number-1; i--) {
                if(guests[i-1] != null && guests[i] == null) {
                    guests[i] = guests[i-1];
                }
            }
            
            guests[number-1] = newName;
        }else {
            System.out.println("Error: There is no guest with that number.");
        }

    } 

    static void renameGuest() {
        System.out.print("Number: ");
        int number = scanner.nextInt();
        scanner.nextLine();
        
        System.out.print("Name: ");
        String newName = scanner.nextLine();
        guests[number-1] = newName;

    } 


    static void removeGuest() {
        System.out.print("Number: ");
        int number = scanner.nextInt();
        do {
            System.out.println("Error: There is no guest with that number.");
            System.out.print("Number: ");
            number = scanner.nextInt();
        }while(number >= 10 && number < 0 && guests[number-1] != null);
        guests[number-1] = null;

        String[] tempGuestList = new String[guests.length];
        int tempIndex = 0;
        for(int i = 0; i < guests.length; i++) {
            if(guests[i] != null) {
                tempGuestList[tempIndex] = guests[i];
                tempIndex++;
            }
        }
        guests = tempGuestList;        
    }

     static void insertTestNames() {
            guests[0] = "Jacob";
            guests[1] = "Edward";
            guests[2] = "Rose";
            guests[3] = "Molly";
            guests[4] = "Christopher";
        }
}
