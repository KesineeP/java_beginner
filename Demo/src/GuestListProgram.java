import java.util.Scanner;

public class GuestListProgram {
    static String[] guests = new String[10];
    static Scanner scanner = new Scanner(System.in);
    public static void guestList() {
        
        // guests[0] = "Jacob";
        // guests[1] = "Edward";
        // guests[2] = "Rose";
        // guests[3] = "Molly";
        // guests[4] = "Christopher";

        do {
            displayGuests();
            displayMenu();
            int option = getOption();
            System.out.println();

            if(option == 1) {
                for (int i = 0; i < guests.length; i++) {
                    if(guests[i] == null) {
                        System.out.print("Name: ");
                        guests[i] = scanner.next();
                        break;
                    }
                }
            }
            else if(option == 2) {
                System.out.print("Name: ");
                String name = scanner.next();
                for(int i = 0; i < guests.length; i++) {
                    if(guests[i] != null && guests[i].equals(name)) {
                        guests[i] = null;
                        break;
                    }
                }

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
            else if(option == 3) {
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
            System.out.println("2 - Remove Guest");
            System.out.println("3 - Exit");
    }

    static int getOption() {
        System.out.print("Option: ");
        return scanner.nextInt();
    }
}
