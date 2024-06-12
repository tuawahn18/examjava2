package AddressBook;

import java.util.Scanner;

public class MainThread {
    public static void main(String[] args) {
        ContactController contactController = new ContactController();
        Scanner scanner = new Scanner(System.in);

        while (true) {
            System.out.println("Menu:");
            System.out.println("1. Add new contact");
            System.out.println("2. Find a contact by name");
            System.out.println("3. Display contacts");
            System.out.println("4. Exit");

            System.out.print("Enter your choice: ");
            int choice = scanner.nextInt();
            scanner.nextLine(); // consume the newline character

            switch (choice) {
                case 1:
                    contactController.createContact();
                    break;
                case 2:
                    contactController.findByName();
                    break;
                case 3:
                    contactController.showContact();
                    break;
                case 4:
                    System.out.println("Exiting the application.");
                    System.exit(0);
                default:
                    System.out.println("Invalid choice. Please try again.");
            }
        }
    }
}
