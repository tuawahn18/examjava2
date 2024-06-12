package AddressBook;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Scanner;

public class ContactController {
    ArrayList<Contact> contacts = new ArrayList();
    Scanner scanner;

    public ContactController() {
        this.scanner = new Scanner(System.in);
    }


    public void createContact() {
        Contact contact = new Contact();
        System.out.println("Please enter user information.");
        System.out.print("Enter Name: ");
        contact.setName(scanner.nextLine());
        System.out.print("Enter Company: ");
        contact.setCompany(scanner.nextLine());
        System.out.print("Enter Email: ");
        contact.setEmail(scanner.nextLine());
        System.out.print("Enter Phone: ");
        contact.setPhone(scanner.nextLine());
        this.contacts.add(contact);
    }

    public void findByName() {
        System.out.print("Nhập tên cần tìm: ");
        String name = scanner.nextLine();

        for (Contact contact : contacts) {
            if (contact.getName().equalsIgnoreCase(name)) {
                System.out.println("Phone: " + contact.getPhone());
                return;
            }
        }
        System.out.println("Không tìm thấy");
    }

    public void showContact() {
        if (contacts.isEmpty()) {
            System.out.println("Không có liên lạc nào.");
            return;
        }

        System.out.println("Address Book ");
        System.out.printf("%-20s %-20s %-20s %-20s\n", "ContactName", "Company", "Email", "Phone number");
        System.out.println("                                                        ");
        for (Contact c : contacts) {
            System.out.printf("%-20s %-20s %-20s %-20s\n", c.getName(), c.getCompany(), c.getEmail(), c.getPhone());
        }
    }
}
