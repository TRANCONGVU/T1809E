package AddressBook;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        
        System.out.println("Vui long chon :");
        System.out.println("---------------");
        System.out.println("1.Add new contact ");
        System.out.println("2.Find a contact by name");
        System.out.println("3.Display contacts");
        System.out.println("4.Exit");


        Scanner in = new Scanner(System.in);
        int option = in.nextInt();
        Contact ct = new Contact();
        switch (option){
            case 1 :
                System.out.println("Add new contact");
                ct.AddNewContact();
                break;
            case  2:
                System.out.println("Find a contact by name");
                ct.FindContact();
                break;
            case 3:
                System.out.println("Show contact !");
                ct.DisplayContact();
                break;
            case 4:
                ct.Exit();
                break;
             default:
                 System.out.println("Wrong!!!");

        }
    }
}