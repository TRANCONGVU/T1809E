package AddressBook;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Scanner;
import javafx.application.Platform;

public class Contact {
    public String ContactName;
    public String PhoneNumber;

    public Contact(String contactName, String phoneNumber) {
        ContactName = contactName;
        PhoneNumber = phoneNumber;
    }

    public Contact() {

    }


    public String getContactName() {
        return ContactName;
    }

    public void setContactName(String contactName) {
        ContactName = contactName;
    }

    public String getPhoneNumber() {
        return PhoneNumber;
    }

    public void setPhoneNumber(String phoneNumber) {
        PhoneNumber = phoneNumber;
    }
    Scanner input = new Scanner(System.in);
    public void AddNewContact(){
        System.out.println("Contact name : ");

        String contactName = input.nextLine();
        System.out.println("Input Phone number");
        String Phone = input.nextLine();
        HashMap<String, Contact> hashMap = new HashMap<String, Contact>();
        ArrayList<Contact> listContact = new ArrayList<Contact>();
        listContact.add(hashMap.put("1", new Contact(contactName, Phone)));
        System.out.println("You inset" + "Contact Name :" + contactName  +": " + "phone :" + Phone);
        show();

    }
    public void FindContact(){
        ArrayList<Contact> listContact = new ArrayList<Contact>();
        System.out.println("Input name you want search");
        Scanner searchName = new Scanner(System.in);

        for (int i = 0; i < listContact.size(); i++) {

            System.out.println(listContact.get(i));
        }
        show();

    }
    public void DisplayContact(){
        System.out.println("Display Contact");
        ArrayList<Contact> listContact = new ArrayList<Contact>();
        System.out.println(listContact);
        show();

    }
    public void Exit(){
        Platform.exit();
    }
    public void show(){
        System.out.println("Vui long chon :");
        System.out.println("---------------");
        System.out.println("1.Add new contact ");
        System.out.println("2.Find a contact by name");
        System.out.println("3.Display contacts");
        System.out.println("4.Exit");
    }
}
